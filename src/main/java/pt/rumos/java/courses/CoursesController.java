package pt.rumos.java.courses;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
@Data
public class CoursesController {

    static int ID = 1;
    static List<Course> persistedCourses = new ArrayList<>();

    @Autowired
    private CoursesService service;

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



    @GetMapping("/courses/editCourse/{id}")
    public ModelAndView delete(@PathVariable("id") int courseID, Model model) {

        System.out.println("courseID");
        deleteCourse(courseID);
        model.addAttribute("coursesList", persistedCourses);
        return new ModelAndView("redirect:/courses");

    }

    private void deleteCourse(int courseID){
        for (Course c : persistedCourses) {
            if (c.getID() == courseID) {
                persistedCourses.remove(c);
            }
        }
    }


    @PutMapping("/courses/editCourse/{id}")
    public Course update(@PathVariable("id") int courseID, @RequestBody Course toUpdate) {

        for (Course c : persistedCourses) {
            if (c.getID() == courseID) {
                c.setName(toUpdate.getName());
                c.setDescription(toUpdate.getDescription());
                return c;
            }
        }
        return toUpdate;
    }



}
