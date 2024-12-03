package in.ahmed.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.ahmed.entity.Product;
import in.ahmed.repository.ProductRepository;

@Service
public class ProductService {

	private ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	public void insertUsers() {

		Product product = new Product();
		product.setId(201);
		product.setName("Tv");
		product.setPrice(2000.0);

		Product product2 = new Product();
		product2.setId(202);
		product2.setName("MOBILE");
		product2.setPrice(5000.0);

		Product product3 = new Product();
		product3.setId(203);
		product3.setName("EARPHONES");
		product3.setPrice(1000.0);

		List<Product> asList = Arrays.asList(product, product2, product3);
		productRepository.saveAll(asList);
	}
	
	public void updateUser(Integer id) {
		Optional<Product> byId = productRepository.findById(id);
		Product product = byId.get();
		product.setPrice(20000.0);
		
		productRepository.save(product);
		
	}
	public void deleteUser() {
		productRepository.deleteById(201);
		
	}

}
