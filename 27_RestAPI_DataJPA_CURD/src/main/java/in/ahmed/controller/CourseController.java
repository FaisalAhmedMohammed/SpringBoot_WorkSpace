package in.ahmed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ahmed.binding.Course;
import in.ahmed.service.CourseService;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;

	@PostMapping("/create")
	public ResponseEntity<String> createCourse(Course course) {

		String upSert = courseService.upSert(course);
		return new ResponseEntity<>(upSert, HttpStatus.CREATED);

	}

	@GetMapping("course{cid}")
	public ResponseEntity<Course> getCourse(@PathVariable Integer cid) {
		Course byId = courseService.getById(cid);
		return new ResponseEntity<Course>(byId, HttpStatus.OK);
	}

	@GetMapping("/allcourses")
	public ResponseEntity<List> getAllCourses() {
		List<Course> allCourses = courseService.getAllCourses();
		return new ResponseEntity<List>(allCourses, HttpStatus.OK);
	}

	@PutMapping("/create")
	public ResponseEntity<String> updateCourse(Course course) {

		String status = courseService.upSert(course);
		return new ResponseEntity<>(status, HttpStatus.CREATED);

	}

	public ResponseEntity<String> deleteCourse(Integer cid) {
		String deleteById = courseService.deleteById(cid);
		return new ResponseEntity<>(deleteById, HttpStatus.OK);
	}

}
