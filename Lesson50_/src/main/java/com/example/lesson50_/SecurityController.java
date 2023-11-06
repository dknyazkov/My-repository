package com.example.lesson50_;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class SecurityController {

    @GetMapping("/public")
    public String publicPage() {
        return "public";
    }

    @GetMapping("/private")
    public String privatePage() {
        return "private";
    }


}
