package in.ahmed.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ahmed.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{

}
