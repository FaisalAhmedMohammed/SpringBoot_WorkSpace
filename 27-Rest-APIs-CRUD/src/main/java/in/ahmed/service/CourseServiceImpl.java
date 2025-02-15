package in.ahmed.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ahmed.bindings.Course;
import in.ahmed.repo.CourseRepo;
import jakarta.persistence.EntityNotFoundException;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepo courseRepo;

	@Override
	public Course upSert(Course course) {
		return courseRepo.save(course);
	}

	@Override
	public Course getById(Integer cid) {
		Optional<Course> byId = courseRepo.findById(cid);
		return byId.orElse(null);
	}

	@Override
	public List<Course> getAllCourses() {
		return courseRepo.findAll();
	}

	@Override
	public void deleteById(Integer cid) {
		if (!courseRepo.existsById(cid)) {
			throw new EntityNotFoundException("Course not found with id: " + cid);
		}
		courseRepo.deleteById(cid);
	}
}
