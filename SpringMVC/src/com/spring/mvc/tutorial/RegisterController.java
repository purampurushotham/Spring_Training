package com.spring.mvc.tutorial;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.spring.mvc.tutorial.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class RegisterController {
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String setForm(Model model) {
        model.addAttribute("user", new User());
        System.out.println("Deesadsjkagfdka***********");
        return "welcome";
    }
    @RequestMapping(value = "/register" ,method = RequestMethod.POST)
    public String submit(User user,Model model) {

        model.addAttribute("firstName",user.getFirstName());
        model.addAttribute("lastName",user.getLastName());
        model.addAttribute("age",user.getAge());
        System.out.println("lastName: " + user.getLastName());
        System.out.println("age: " + user.getAge());
        return "greeting";
    }
}
