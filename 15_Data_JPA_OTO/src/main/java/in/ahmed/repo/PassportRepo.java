package in.ahmed.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ahmed.entity.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer> {

}