package com.laptrinhjavaweb.controller.web;

import com.laptrinhjavaweb.entity.Products;
import com.laptrinhjavaweb.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller(value = "homeControllerOfWeb")
@SessionAttributes("products")
public class HomeController {
    @Autowired
    private AbstractService productsService;
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView homePage() {
//        List<Products> products= productsService.findAll();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("web/home");
//        mav.addObject("products", products);
        return mav;
    }
}
