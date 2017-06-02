package cn.hanfei.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

  /*  @Autowired
    private TestService testService;*/

    @Value("${hanfei}")
    String string;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/login")
    @ResponseBody
    String login() {
//        testService.talk();
        return string;
    }

  /*  public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }*/
}