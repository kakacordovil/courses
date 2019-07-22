package pt.rumos.java.courses;


import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class CoursesAdsService {
   public List<Course> course;

   // public CoursesAdsService() {
       // course = new ArrayList<>();

      //  Course courseList = new Course();
      //  courseList.setDescription("Descrição");
      //  courseList.setName("curso1");
      //  course.add(courseList);

   // }
}
