package cn.libra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by clam on 2017/1/13.
 */

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/test")
    public  void test(){

    }
}
