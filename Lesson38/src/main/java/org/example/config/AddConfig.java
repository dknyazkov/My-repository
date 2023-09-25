package org.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Configuration
public class AddConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        LocaleChangeInterceptor locale=new LocaleChangeInterceptor();
        locale.setParamName("language");
        registry.addInterceptor(locale);
        registry.addInterceptor(new MyIntercepter());
    }
}