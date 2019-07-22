package pt.rumos.java.courses;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
@Data
public class CoursesAdsController {

    static int ID = 1;
    static List<Course> persistedCourses = new ArrayList<>();

    @GetMapping("/")
    public String newCourse(){
        return "courses";
    }

    @GetMapping("/courses")
    public String getCourses(Model model) {
        model.addAttribute("coursesList", persistedCourses);

        return "courses";
    }

    @PostMapping("/courses")
    public String newCourses(Course course, Model model) {

        course.setID(ID++);
        persistedCourses.add(course);
        model.addAttribute("coursesList", persistedCourses);

        return "courses";
    }


}
