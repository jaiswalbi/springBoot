package com.cubic.springbootdemo.service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	@Value("${info.build.artifact}")
	private String artifact;
	
	public void readValues() {
		System.out.println("Artifact= "+ artifact);
	}
}
