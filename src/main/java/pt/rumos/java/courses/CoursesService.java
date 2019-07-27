package pt.rumos.java.courses;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
@Data
public class CoursesService {

    List<Course> courses;

    //private static final Logger LOGGER = Logger.getLogger("CoursesService");



}
