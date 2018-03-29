package com.spring.mvc.tutorial;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class RegisterController{
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        return "redirect:/addUser";
    }
    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String setForm(Model model) {
        model.addAttribute("user", new User());
        /*cannot instantiate to private constructor*/
        /*model.addAttribute("user1",new User("puram","puram",23));*/
        return "register";
    }
    @RequestMapping(value = "/viewUser" ,method = RequestMethod.POST)
    public String submit(User user,Model model) {
        ModelAndView mav = null;
        model.addAttribute("firstName",user.getFirstName());
        model.addAttribute("lastName",user.getLastName());
        model.addAttribute("age",user.getAge());
        return "userDetails";
    }
}
