package in.ahmed.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ahmed.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
