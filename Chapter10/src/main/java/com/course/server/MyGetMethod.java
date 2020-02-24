package com.course.server;


import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/MyGetMethod")
public class MyGetMethod {

    @RequestMapping(value = "/getCookies",method = RequestMethod.GET)
    public String getCookies(){


        return "恭喜你获得cookies信息成功";
    }







}
