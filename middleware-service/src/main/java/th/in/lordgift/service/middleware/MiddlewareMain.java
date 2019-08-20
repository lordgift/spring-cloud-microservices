package th.in.lordgift.service.middleware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MiddlewareMain {

	public static void main(String[] args) {
		SpringApplication.run(MiddlewareMain.class, args);
	}
}