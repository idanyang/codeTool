package com.example.tool;

import com.example.tool.main.MainRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class ToolApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ToolApplication.class, args);
        MainRunner mr = new MainRunner();
        mr.generateCode();
	}

}
