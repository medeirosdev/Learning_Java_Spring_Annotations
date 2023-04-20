package com.example.javaWEBSPRINGL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // Notação do Spring Padrão
@ComponentScan(basePackages = "models")
public class JavaWebspringlApplication {
	//static FirstController primeiroController = new FirstController();
	public static void main(String[] args) {

		SpringApplication.run(JavaWebspringlApplication.class, args);
		//primeiroController.HelloWorldSpring("meu nome foda");

	}



}
