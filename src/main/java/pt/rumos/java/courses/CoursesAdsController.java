package pt.rumos.java.courses;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class CoursesAdsController {

    Set<Course> persistedCouses = new HashSet<>();

    @GetMapping("/")
    public String newCourse(){
        return "courses";
    }


    @GetMapping("/courses")
    public String newCourses(Model model) {

//        List<Course> course = new ArrayList<>();
//        course.add(new Course ("java","java SE"));
//        course.add(new Course ("php","php"));
        model.addAttribute("coursesList", persistedCouses);

        return "courses";
    }

}
