package in.ahmed.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ahmed.entity.Order;

public interface OrderRepo  extends JpaRepository<Order, Integer>{

}
