package com.example.lesson50_.controller;

import com.example.lesson50_.service.PersonService;
import com.example.lesson50_.domain.PersonDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping
public class SecurityController {
private final PersonService service;
    @GetMapping("/public")
    public String publicPage() {
        return "public";
    }

    @GetMapping("/user")
    public String userPage() {
        return "user";
    }


    @GetMapping("/admin")
    public String adminPage() {
        return "admin";
    }

    @PostMapping("/public")
    public String save(PersonDTO personDTO){
        service.savePerson(personDTO);
        return "public";

    }

    @GetMapping("/private")
    public String privatePage() {
        return "private";
    }


}
