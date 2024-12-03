package in.ahmed.repository;

import org.springframework.data.repository.CrudRepository;

import in.ahmed.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
