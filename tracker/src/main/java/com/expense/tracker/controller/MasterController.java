package com.expense.tracker.controller;

 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 import org.springframework.beans.factory.annotation.Autowired;
@Controller
public class MasterController {
    @GetMapping("/home")
    public String home()
    {
        return "index";
    }
}
