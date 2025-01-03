package in.ahmed.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ahmed.entiry.User;

public interface UserRepo  extends JpaRepository<User, Integer>{

}
