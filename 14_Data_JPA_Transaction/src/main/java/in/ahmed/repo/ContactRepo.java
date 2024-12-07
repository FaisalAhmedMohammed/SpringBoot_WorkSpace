package in.ahmed.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ahmed.entity.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer> {

}
