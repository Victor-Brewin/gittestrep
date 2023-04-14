package com.brewin.entiry;

import com.brewin.service.Action;

public class Dog extends Animal implements Action {

	public Dog(String name) {
		super(name);
		
	}

	@Override
	public void bark() {
		System.out.println(this.getName()+":ÍôÍô½Ð£¡£¡£¡");

		
	}

}
