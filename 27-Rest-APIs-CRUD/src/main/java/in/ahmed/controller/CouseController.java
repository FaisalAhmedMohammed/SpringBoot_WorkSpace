package in.ahmed.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ahmed.bindings.Course;
import in.ahmed.service.CourseService;
import jakarta.persistence.EntityNotFoundException;

@RestController
public class CouseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/course")
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
    	System.out.println("CouseController.createCourse()");
        Course createdCourse = courseService.upSert(course); // return the course object created
        return new ResponseEntity<Course>(createdCourse, HttpStatus.CREATED); // return the course, not a string
    }

    @GetMapping("/course/{cid}")
    public ResponseEntity<Course> retrieveCourse(@PathVariable Integer cid) {
        Course course = courseService.getById(cid);
        if (course != null) {
            return new ResponseEntity<>(course, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // return 404 if not found
        }
    }

    @GetMapping("/courses")
    public ResponseEntity<List<Course>> getAllCourses() {
        List<Course> allCourses = courseService.getAllCourses();
        return new ResponseEntity<>(allCourses, HttpStatus.OK);
    }

    @GetMapping("/delete/{cid}")
    public ResponseEntity<String> deleteCourse(@PathVariable Integer cid) {
        try {
            courseService.deleteById(cid); // No return value, handled by service
            return new ResponseEntity<>("Course deleted successfully", HttpStatus.OK); // Success message
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND); // Handle not found case
        }
    }
}
