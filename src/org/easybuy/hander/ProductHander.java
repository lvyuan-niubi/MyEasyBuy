package org.easybuy.hander;

import org.easybuy.entity.Product_Category;
import org.easybuy.service.impl.ProductCatagoryServiceImpl;
import org.easybuy.util.Pager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@RequestMapping("ProductHander")
@SessionAttributes(value = {"CatagoryList"})
public class ProductHander {

    @RequestMapping("CatagoryData/{currentPage}")
    public String catagoryData(@PathVariable("currentPage") int currentPage, ModelMap modelMap){
        //limit (当前页码-1) * 每页显示数据行数 , 每页显示数据行数
        //获取总行数
          ProductCatagoryServiceImpl productCatagoryService = getService();
          int rowCount = productCatagoryService.queryCatagoryRows();
        //获取总页数
            Pager pager = new Pager(rowCount,8,currentPage);
        //当前页码 <= 总页码
        if(currentPage <= pager.getPageCount() && currentPage >=1){
            List<Product_Category> list = productCatagoryService.queryCatagoryByPage(pager);
            modelMap.addAttribute("CatagoryList",list);
        }else{
            pager.setCurrentPage(1);
            List<Product_Category> list = productCatagoryService.queryCatagoryByPage(pager);
            modelMap.addAttribute("CatagoryList",list);
        }
        modelMap.addAttribute("pageCount",pager.getPageCount());
        return "redirect:/AdminProductCatagory.jsp";
    }

    public ProductCatagoryServiceImpl getService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        return (ProductCatagoryServiceImpl) context.getBean("productCatagoryService");
    }
}
