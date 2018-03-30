package com.spring.mvc.tutorial.controller;
import com.spring.events.publisher.CustomSpringEventPublisher;
import com.spring.mvc.tutorial.modal.User;
import com.spring.mvc.tutorial.service.MyAnnotatedBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import java.util.Locale;

@Controller
@Scope("request")
public class RegisterController implements ApplicationContextAware{
    private User user;
    private ApplicationContext applicationContext;
    private MyAnnotatedBean myAnnotatedBean;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    @Autowired
    public void setUser(User user){
        System.out.println("Bean based Autowirewd");
        System.out.println(user.getFirstName());
        this.user = user;
    }
    @Autowired
    public void setMyAnnotatedBean(MyAnnotatedBean myAnnotatedBean){
        System.out.println("Autowire annotaterd bean Autowirewd");
        System.out.println(myAnnotatedBean.getId());
        this.myAnnotatedBean = myAnnotatedBean;
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        return "redirect:/addUser";
    }
    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String setForm(Model model) {
        System.out.println("MyBean hashcode="+user.hashCode());
        System.out.println("MyAnnotatedBean hashcode="+myAnnotatedBean.hashCode());
        model.addAttribute("user", new User());
        /*cannot instantiate to private constructor*/
        /*model.addAttribute("user1",new User("puram","puram",23));*/
        return "register";
    }
    @RequestMapping(value = "/viewUser" ,method = RequestMethod.POST)
    public String submit(User user,Model model) {
        ModelAndView mav = null;
        CreateCustomEvent(user);
        model.addAttribute("firstName",user.getFirstName());
        model.addAttribute("lastName",user.getLastName());
        model.addAttribute("age",user.getAge());
        return "userDetails";
    }
    public void CreateCustomEvent(User user){
        System.out.println("");
        applicationContext = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        CustomSpringEventPublisher publisher = applicationContext.getBean(CustomSpringEventPublisher.class);
        publisher.doProcessAndPublishAnEvent("User is Registered");
    }
}
