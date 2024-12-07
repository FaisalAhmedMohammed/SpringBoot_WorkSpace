package in.ahmed.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ahmed.entity.Contect;
import in.ahmed.repo.ContectRepo;
@Service
public class ContectService {
	@Autowired
	private ContectRepo contectRepo;
	
	public void saveNewUser() {
		Contect contect =new Contect();
		contect.setId(null);
		contect.setName("SCOTT");
		contect.setAge(45);
		contect.setCountry("USA");
		
		contectRepo.save(contect);
	}

}
