package com.javaboy.devicequery.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("photo")
public class photoController {


    @RequestMapping("getJson")
    @ResponseBody
    public String test(@RequestBody String a){
        System.out.println("收到的数据："+a);
        return "pk";
    }

}
