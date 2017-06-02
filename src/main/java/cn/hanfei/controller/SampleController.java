package cn.hanfei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/login")
    @ResponseBody
    String login() {
        return "韩斐然";
    }

  /*  public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }*/
}