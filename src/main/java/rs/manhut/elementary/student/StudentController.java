package rs.manhut.elementary.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

}

