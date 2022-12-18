package com.rto.vehicalinspection.Home;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/home")
public class HomeController {
    
    @GetMapping
    @ResponseBody
    String showHome()
    {
        return "Hello";
    }

    @ResponseBody
    @PostMapping("/{activityString}")
    String redirectFromHome(@PathVariable String activityString)
    {
        return  activityString;
    }
}
