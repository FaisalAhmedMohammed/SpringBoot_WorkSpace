package in.ahmed.main;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ahmed.bindings.Customer;

public class App {

	File file = new File("customer.json"); // here json data will store in a file called customer.java

	public void ConvertJavaToJson() throws Exception {
		Customer customer = new Customer();
		customer.setId(101);
		customer.setName("ahmed");
		customer.setPhno(12345L);

		ObjectMapper mapper = new ObjectMapper();// it is a class in jackson API // it is used to convert java object
													// into json data and store it in a file
		mapper.writeValue(file, customer); // write value is a method in mapper class
	}

	public void ConvertJsonToJave() throws Exception {

		File file = new File("customer.json");// the file which contain json data
		ObjectMapper mapper = new ObjectMapper();
		Customer cObj = mapper.readValue(file, Customer.class); // in which java class java object u want to convert
		System.out.println(cObj);
	}

	public static void main(String[] args) throws Exception {
		App app = new App();
		//app.ConvertJavaToJson();
		System.out.println("Conversion Successful");
		
		app.ConvertJsonToJave();
	}

}
