package in.ahmed.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

	public void saveProduct() {

		System.out.println("Product saved in database");
	}

}
