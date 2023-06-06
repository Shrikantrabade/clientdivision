package com.BikkadIT.Client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rahul.Devision;

import Controller.OddEvanNo;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
		
		
		OddEvanNo OdEven=new OddEvanNo();
		
		
		Devision dev=new  Devision();
		int result=dev.Dev(100, 5);
		System.out.println(result);
		
	}

}
