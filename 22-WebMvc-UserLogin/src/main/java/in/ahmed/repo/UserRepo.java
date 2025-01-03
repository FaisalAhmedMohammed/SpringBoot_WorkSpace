package in.ahmed.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ahmed.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
