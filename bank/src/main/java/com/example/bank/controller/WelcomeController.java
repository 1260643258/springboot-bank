package com.example.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    /**
     * 查询银行信息
     */
    @RequestMapping(value = "/index")
    public String index()
    {
        return "index";
    }
}
