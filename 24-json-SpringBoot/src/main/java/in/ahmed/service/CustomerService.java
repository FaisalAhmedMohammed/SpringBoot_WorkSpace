package in.ahmed.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ahmed.bindings.Customer;

@Service
public class CustomerService {
	@Autowired
	private ObjectMapper objectMapper;

	private static final String FILE_PATH = "customer.json";

	public void convertJavaToJson() throws Exception {

		Customer customer = new Customer();
		customer.setId(101);
		customer.setName("faisal");
		customer.setPhno(78765l);
		objectMapper.writeValue(new File(FILE_PATH), customer);

	}

	public Customer convertJsonToJava() throws Exception {
		return objectMapper.readValue(new File(FILE_PATH), Customer.class);
	}

}
