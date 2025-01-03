package in.ahmed.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ahmed.binding.Product;

@RestController
public class ProductController {

	@PostMapping(value = "/product",
			produces = "text/plane",
			consumes = "application/json")
	public ResponseEntity<String> addProduct(@RequestBody Product p) {

		String msgString = "welcome to RestAPIs";
		return new ResponseEntity<>(msgString, HttpStatus.CREATED);

	}

	@GetMapping(value = "/product/{id}", produces = "application/json")
	public ResponseEntity<Product> getProduct(@PathVariable Integer id) {
		Product product = new Product(id, "TV", 2000.0);

		return new ResponseEntity<Product>(product, HttpStatus.OK);

	}

	@GetMapping(value = "/products", produces = "application/json")
	public ResponseEntity<List<Product>> getProducts() {
		Product p1 = new Product(102, "Mouse", 1000.0);
		Product p2 = new Product(103, "Keyboard", 2000.0);
		Product p3 = new Product(104, "Speakers", 2500.0);

		List<Product> asList = Arrays.asList(p1, p2, p3);

		return new ResponseEntity<List<Product>>(asList, HttpStatus.OK);// here we create constructor

		// return ResponseEntity.ok(asList) both are same approach
	}

	@GetMapping(value = "/prod", produces = "application/json")
	public ResponseEntity<Product> getByQuery(@RequestParam Integer id) {

		Product product = new Product(id, "Laptop", 50000.0);

		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}

}
