package com.hand.zs.boot.test1;

import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
@SpringBootApplication
public class Application {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/now")
    String hehe() {
        return "现在时间：" + (new Date()).toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);//简单启动
//        SpringApplication app = new SpringApplication(Application.class);
//        app.run(args);//可设置更多初始化配置
    }

}
