package in.ahmed.service;

import java.util.List;

import in.ahmed.bindings.Course;

public interface CourseService {

    public Course upSert(Course course);

    public Course getById(Integer cid);

    public List<Course> getAllCourses();

    public void deleteById(Integer cid);
}
