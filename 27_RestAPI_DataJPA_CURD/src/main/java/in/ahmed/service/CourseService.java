package in.ahmed.service;

import java.util.List;

import org.hibernate.type.descriptor.java.IntegerJavaType;
import org.springframework.beans.factory.annotation.Autowired;

import in.ahmed.binding.Course;
import in.ahmed.repo.CourseRepo;

public interface CourseService {

	public String upSert(Course courses);

	public Course getById(Integer cid);

	public List<Course> getAllCourses();

	public String deleteById(Integer cid);

}
