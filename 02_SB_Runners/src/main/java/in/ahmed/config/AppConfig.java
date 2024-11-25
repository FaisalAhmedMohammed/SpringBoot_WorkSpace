package in.ahmed.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ahmed.Security.AppSecurity;
@Configuration
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig :: Constructor");
	}
	@Bean
	public AppSecurity getIstance() {
		return new AppSecurity();
	}

}
