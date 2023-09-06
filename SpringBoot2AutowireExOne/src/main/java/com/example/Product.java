package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pobj")
public class Product {
	@Value("499")
	private int pid;
	@Value("Pen")
	private String pcode;
	
	@Autowired
	private Model mob;//HAS A relation
	
	public void getProduct() {
		System.out.println("Product "+pid+pcode);
		mob.getModel();
	}

}
