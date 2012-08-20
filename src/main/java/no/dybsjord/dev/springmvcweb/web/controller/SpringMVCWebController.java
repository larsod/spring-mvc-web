package no.dybsjord.dev.springmvcweb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/login")
public class SpringMVCWebController {

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public void test() {
        System.out.println("foobar");
    }

    @RequestMapping(value="/home", method = RequestMethod.GET)
    public void test2() {
        System.out.println("foobar");
    }
}
