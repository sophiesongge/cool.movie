package com.cool.movie.controller;

/**
 * @author Sophie Song
 * @since 2017/2/3
 */
import java.util.concurrent.atomic.AtomicLong;
import com.cool.movie.model.Greeting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//这个Controller处理一个给/hello-world发的request, 并且返回一个Greeting资源
//用法:
//curl localhost:9000/hello-world 会返回"Hello, Stranger"
//curl localhost:9000/hello-world?name="Sophie" 会返回"Hello, Sophie"
//curl命令是利用URL规则在命令行下工作的文件传输工具

@Controller
@RequestMapping("/hello-world")
public class HelloWorldController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method=RequestMethod.GET)//说明这个sayHello的方法要处理一个GET请求
    public @ResponseBody Greeting sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    //@ResponseBody告诉Spring不要将一个Model渲染成一个View, 而是将返回的对象写到response body中
}

