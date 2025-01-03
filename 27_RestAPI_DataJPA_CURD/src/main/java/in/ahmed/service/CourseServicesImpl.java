package in.ahmed.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.dialect.function.AvgFunction.ReturnTypeResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ahmed.binding.Course;
import in.ahmed.repo.CourseRepo;

@Service
public class CourseServicesImpl implements CourseService {

	@Autowired
	private CourseRepo courseRepo;

	@Override
	public String upSert(Course courses) {
		Course savedCourse = courseRepo.save(courses);
		if (savedCourse != null) {

			return "Course saved";
		} else

			return "Course Not Found";
	}

	@Override
	public Course getById(Integer cid) {
		Optional<Course> byId = courseRepo.findById(cid);
		if (byId.isPresent()) {
			byId.get();
		}

		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		return courseRepo.findAll();

	}

	@Override
	public String deleteById(Integer cid) {

		if (courseRepo.existsById(cid)) {
			courseRepo.deleteById(cid);
			return "Delete Success";
		} else {
			return "NO Record Found";
		}
	}

}
