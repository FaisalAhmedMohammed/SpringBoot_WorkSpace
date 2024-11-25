package in.ahmed.banners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CmdRunner implements CommandLineRunner {

	public CmdRunner() {
		System.out.println("CmdRunner :: Constructor");
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("This login will be executed only once"); 

	}

}
