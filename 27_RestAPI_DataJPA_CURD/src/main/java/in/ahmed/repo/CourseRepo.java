package in.ahmed.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ahmed.binding.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}
