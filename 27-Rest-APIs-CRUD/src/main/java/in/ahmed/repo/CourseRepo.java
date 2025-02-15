package in.ahmed.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ahmed.bindings.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}
