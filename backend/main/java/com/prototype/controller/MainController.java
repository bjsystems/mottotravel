package com.prototype.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/api", method = RequestMethod.GET)
public class MainController {
    @CrossOrigin(origins="*")
    @GetMapping("/test")
    public void ex1() {
        System.out.println("컨트롤러 테스트");
    }
}
