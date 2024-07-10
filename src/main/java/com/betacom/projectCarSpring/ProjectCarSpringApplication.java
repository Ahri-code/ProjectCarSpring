package com.betacom.projectCarSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.betacom.projectCarSpring.process.ProcessTest;

@SpringBootApplication
public class ProjectCarSpringApplication {

	@Autowired
	ProcessTest proS;

	public static void main(String[] args) {
		SpringApplication.run(ProjectCarSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
			proS.execute();
		};
	}
}