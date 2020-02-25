package org.easybuy.hander;

import org.easybuy.entity.Order;
import org.easybuy.entity.Product;
import org.easybuy.entity.User;
import org.easybuy.service.impl.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/*
* 订单控制器
* */
@RequestMapping("OrderHander")//将普通类变成控制器
@Controller//纳入ioc容器
@SessionAttributes(value = {"Order","ProductList"})//如果request域中添加次数据 那么session域也添加
public class OrderHander {

    //前台传入路径中 包含id值
    @RequestMapping("queryOrderList/{userId}")
    public String queryOrderList(@PathVariable("userId") int id, ModelMap modelMap, HttpServletRequest request){
        //spring 上下文对象
            ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //service对象
            OrderServiceImpl orderService = (OrderServiceImpl) context.getBean("orderServiceImpl");
        //查询订单
            Order order = orderService.queryOrderByUserId(id);
        //查询订单 所有商品
            List<Product> Productlist = orderService.queryProductListByOrderId(order.getId());
        //将数据加入request域中 作用为了放入session域中
            modelMap.addAttribute("Order",order);//将数据添加到request域中
            modelMap.addAttribute("ProductList", Productlist);//将数据添加到request域中
        //从session域中 获取user的type值
        HttpSession session = request.getSession();
            User user = (User)session.getAttribute("User");
        System.out.println(user.getType());
        return "redirect:/AdminOrder.jsp";//重定向跳转
    }

}
