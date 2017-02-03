package com.cool.movie; /**
 * @author Sophie Song
 * @since 2017/2/2
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//很方便的将@Configuration, @EnableAutoConfiguration, @E#nableWebMvc, @ComponentScan都加入了, 这里是Spring Application的入口

public class Application {

    //main方法用了Spring Boot的SpringApplication.run()来启动一个application
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

}
