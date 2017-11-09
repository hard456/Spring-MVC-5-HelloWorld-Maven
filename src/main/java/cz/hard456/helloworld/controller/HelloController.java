package cz.hard456.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView viewHome(){
        ModelAndView model = new ModelAndView();
        model.setViewName("home");
        model.addObject("helloObject","HelloWorld");
        return model;
    }

}
