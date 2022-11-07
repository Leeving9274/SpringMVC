package com.lee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by WinLee on 2022/11/7.
 */

@Controller
public class EncodingController {

    @PostMapping("/e/t")
    public String test1(String name, Model model){
        model.addAttribute("msg", name + "aaaa");
        return "hello";
    }
}
