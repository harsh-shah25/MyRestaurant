package com.harshshah.khaanakhazana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class KhaanaKhazanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KhaanaKhazanaApplication.class, args);
	}

}
