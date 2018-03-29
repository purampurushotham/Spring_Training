package com.spring.mvc.tutorial.controller;

import com.spring.mvc.tutorial.modal.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Controller
@Scope("request")
public class HomeController {
    @Autowired
    private MessageSource messageSource;
    @RequestMapping(value= "messages/en",method = RequestMethod.GET)
    public String Messages(Locale locale, Model model){
        String welcome = messageSource.getMessage("Hi Puram", new Object[]{"Puram"},locale);
        Locale currentLocale = LocaleContextHolder.getLocale();
        model.addAttribute("locale", currentLocale);
        model.addAttribute("Start","10:00 AM");
        return "messages";
    }
    public void setUser(User user){
    }
}
