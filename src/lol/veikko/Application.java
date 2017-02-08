package lol.veikko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;

@SpringBootConfiguration

public class Application {

		public static void main(String[] args) {
			SpringApplication.run(Application.class, args);
		}

}
