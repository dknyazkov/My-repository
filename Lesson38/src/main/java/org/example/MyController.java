package org.example;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@Controller
@EnableWebMvc
@RequestMapping(value = "/book")
public class MyController {
    private final BookService bookService;

    @GetMapping
    public String homePage() {
        return "home";
    }


    @PostMapping
    public ModelAndView getBook(@Valid Book book, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("Book", bookService.searchBook(book.getName()));
        bookService.validateAge(book.getAge());
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        for (var error : fieldErrors
        ) {
            String defaultMessage = error.getDefaultMessage();
            modelAndView.addObject("error", defaultMessage);
        }

        return modelAndView;
    }
}
