package com.example.accpkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Accionlabs1Application {
	@RequestMapping(value="/")
	 public String welcome() {
	        return "<h1 style='color:green'>Welcome To The Accion-Labs product Eninerring team colaborated with Vera code " + "The Engineering group New Generation Security Apllication Vulneerability</h1>";
	    }


	public static void main(String[] args) {
		SpringApplication.run(Accionlabs1Application.class, args);
	}

}
