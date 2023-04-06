package com.jbk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinMavenGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinMavenGitApplication.class, args);
	}

	@GetMapping("/")
	public String msg()
	{
		return "started";
	}
}
