package pt.rumos.java.courses;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class CoursesAdsController {

    @Autowired
    private CoursesAdsService service;

    @GetMapping("/courses")
    public String newCourses(Model model) {
        model.addAttribute("courses", service.getCourse());

        return "courses";
    }
}
