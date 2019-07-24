package com.cubic.springbootdemo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories({"com.cubic.springbootdemo.repository"})
@EntityScan("com.cubic.springbootdemo.entity")
@SpringBootApplication
@ComponentScan(basePackages = {"com.cubic.springbootdemo"})
public class SpringBootApp {
	
	public static void main( String[] args ){
    	SpringApplication.run(SpringBootApp.class, args); 
    }

}
