package com.ssmbuild.controller;

import com.ssmbuild.pojo.books;
import com.ssmbuild.service.booksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class selectAll {
    @Autowired
    booksService  booksService;

    @RequestMapping("/select")
    public ModelAndView select(){
        books booksList=booksService.queryBookById(1);
        ModelAndView mav=new ModelAndView();
        mav.addObject("Allbooks",booksList);
        mav.setViewName("a");

        return mav;
    }
}
