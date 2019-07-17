package pt.rumos.java.courses;


import org.springframework.web.bind.annotation.GetMapping;

public class CoursesController {

    @GetMapping("/courses")
    public String newCourses() {

        return "courses";
    }
}
