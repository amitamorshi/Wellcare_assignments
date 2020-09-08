package io.wellcare.appstarter;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;



@EnableEurekaServer
@SpringBootApplication
public class WellcareEdurekaServer {

	public static void main(String[] arg) {
		SpringApplication.run(WellcareEdurekaServer.class, arg);

	}

}
