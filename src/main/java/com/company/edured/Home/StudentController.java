package com.company.edured.Home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/index")
    public String dashboard(){
        return "student_dashboard";
    }
}
