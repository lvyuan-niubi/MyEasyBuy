package org.easybuy.hander;
import org.easybuy.entity.User;
import org.easybuy.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.ndktools.javamd5.Mademd5;

import java.util.List;

@Controller//将此类加入ioc容器
@RequestMapping("UserHander")//设置映射拦截类路径
@SessionAttributes(value = {"User","UserList"})//当request域中添加了User值 那么Session域中也添加一个
public class UserHander {

    /*登录方法*/
    @RequestMapping("Login")
    @ResponseBody   //告诉mvc 此方法返回值不是view 而是一个ajax的返回值
    public boolean Login(@RequestParam("loginName") String uname ,
                            @RequestParam("password") String upwd, ModelMap modelMap){
        //查询数据
        UserServiceImpl userService = getService();
        //查询用户 根据用户名
            User user = userService.queryUserByLoginName(uname);
            //处理结果
        //密码加密
            Mademd5 mademd5 = new Mademd5();
                upwd = mademd5.toMd5(upwd);
            //用户名不存在 或者密码错误
        if(user == null || !upwd.equalsIgnoreCase(user.getPassword())){
            return false;
        }
        //将对象放入request域中
            modelMap.addAttribute("User",user);
        return true;
    }

    /*注册用户*/
    @RequestMapping(value = "Regist")
    @ResponseBody   //告诉mvc 此方法返回值不是view 而是一个ajax的返回值
    public boolean Regist(User user,ModelMap modelMap){
        //查询数据
        UserServiceImpl userService = getService();
            //密码加密
                 Mademd5 mademd5 = new Mademd5();
                user.setPassword(mademd5.toMd5(user.getPassword()));
        //查询用户 根据用户名
        User res = null;
        try {
            res = userService.insertUserByUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //处理结果
            modelMap.addAttribute("User",res);
            if(res == null){
                return false;
            }
            return true;
    }

    @RequestMapping("queryAllUser") //请求地址 : UserHander/queryAllUser
    public String queryUserById(ModelMap modelMap){
        //查询数据
            UserServiceImpl userService = getService();
            List<User> list = userService.queryAllUser();
        //处理数据
            modelMap.addAttribute("UserList",list);
            return "redirect:/UserList.jsp";  //响应页面 redirect:(重定向) forward:(请求转发)
    }




    public UserServiceImpl getService(){
        //获得spring context 上下文对象
            ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //获取 service对象
            return (UserServiceImpl) context.getBean("UserServiceImpl");
    }


}
