package pe.upc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekadosApplication.class, args);
	}

}
