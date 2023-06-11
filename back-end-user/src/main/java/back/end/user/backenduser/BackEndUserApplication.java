package back.end.user.backenduser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class BackEndUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackEndUserApplication.class, args);
	}

}
