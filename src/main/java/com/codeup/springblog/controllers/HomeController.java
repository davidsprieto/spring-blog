package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Spring: Fundamentals Controllers
@Controller
public class HomeController {

    @GetMapping("/")
    public String landingPage() {
        return "posts/home";
    }

    // Path Variable
//    @GetMapping("/hello/{name}")
//    @ResponseBody
//    public String sayHello(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }

}

//    NOTES:

//    SPRING: Model [JPA/Repositories], View [Thymeleaf], Controller [Controllers].
//    vs.
//    JAVA III: Model [POJO/JavaBean], View [JSP], Controller [Servlets]