package in.ahmed.Service;

import org.springframework.beans.factory.annotation.Autowired;

import in.ahmed.repo.OrderRepo;

public class OrderService {
	@Autowired
	private OrderRepo orderRepo;

}
