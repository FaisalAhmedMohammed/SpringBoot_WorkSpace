package in.ahmed.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ahmed.Dao.ProductDao;

@Service
public class ProductService {
	@Autowired
	private ProductDao dao;

	public void service() {
		System.out.println("hello");
		dao.saveProduct();
	}

}
