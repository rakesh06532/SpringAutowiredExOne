package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mobj")
public class Model {
	@Value("88")
	private int mid;
	@Value("Red")
	private String mcode;
	
	public void getModel() {
		System.out.println(mid+mcode);
	}

}
