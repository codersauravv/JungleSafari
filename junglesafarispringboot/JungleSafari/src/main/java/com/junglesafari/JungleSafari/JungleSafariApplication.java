package com.junglesafari.JungleSafari;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.junglesafari.JungleSafari.*")
public class JungleSafariApplication {

	public static void main(String[] args) {
		SpringApplication.run(JungleSafariApplication.class, args);
	}

}
