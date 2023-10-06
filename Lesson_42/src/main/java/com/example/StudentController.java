package com.example;

import com.example.domain.StudentDTO;
import com.example.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ModelAndView homePage(@ModelAttribute(name = "student") StudentDTO student) {
        ModelAndView modelAndView=new ModelAndView("home");
        modelAndView.addObject("students",studentService.getAll());
       return modelAndView;

    }


    @PostMapping
    public ModelAndView save(@ModelAttribute(name = "student") StudentDTO student) {
        ModelAndView modelAndView=new ModelAndView("home");
        studentService.save(student);
        modelAndView.addObject("students",studentService.getAll());
        return modelAndView;
    }
}
