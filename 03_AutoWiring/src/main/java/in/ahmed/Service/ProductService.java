package in.ahmed.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ahmed.Dao.ProductDao;

@Service
public class ProductService {

	private ProductDao dao;

	public ProductService() {

		System.out.println("No param :: constructor");
	}
	@Autowired
	public ProductService(ProductDao dao) {
		super();
		this.dao = dao;
	}

	public void service() {
		dao.saveProduct();
	}

}
