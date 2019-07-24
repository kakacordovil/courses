package pt.rumos.java.courses;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class CoursesService {

    List<Course> courses;

}
