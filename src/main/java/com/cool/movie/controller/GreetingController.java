package com.cool.movie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

/**
 * @author Sophie Song
 * @since 2017/2/3
 */
@Controller//在Spring框架中, HTTP Request由controller处理, 而controller由@Controller来指明
public class GreetingController {

    //GreetingController处理发给/greeting的HTTP GET请求, 并返回View的名字(这里是greeting) (View用来渲染HTML页面)

    @RequestMapping("/greeting")//确保将给/greeting的HTTP请求map到greeting()方法上 -- 这个例子并没有指明是哪种HTTP请求, 可通过@RequestMapping(method=GET)来指明
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        //@RequestParam将request中的name变量绑定到greeting方法中的name变量上
        model.addAttribute("name", name); //name变量的值被添加到一个Model对象中, 最终, 这个变量将会被一个View Template接入
        return "greeting";
    }

    //这个例子需要用到一个叫greeting.html的template, 这个template保存在src/main/resources/templates/greeting.html路径下

}
