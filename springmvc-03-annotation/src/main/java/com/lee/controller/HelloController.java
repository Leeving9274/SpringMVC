package com.lee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by WinLee on 2022/11/6.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello1")
    public String hello(Model model){
        //封装数据
        model.addAttribute("msg", "hello SpringMVCAnnotation");
        return "hello";   //会被视图解析器处理
    }

//    restful风格
    @RequestMapping( "/add/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b, Model model){
        int res = (a + b);
        model.addAttribute("msg", "结果为" + res);
        return "hello";
    }
}
