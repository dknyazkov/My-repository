package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class MyWebConfig {
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver  internalResourceViewResolver=new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/");
        internalResourceViewResolver.setSuffix(".jsp");
       return internalResourceViewResolver;
    }
}
