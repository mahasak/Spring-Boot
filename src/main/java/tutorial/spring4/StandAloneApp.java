package tutorial.spring4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StandAloneApp {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(StandAloneApp.class, args);

	}

}
