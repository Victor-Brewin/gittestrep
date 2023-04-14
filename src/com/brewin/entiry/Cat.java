package com.brewin.entiry;

import com.brewin.service.Action;

public class Cat extends Animal implements Action{

	public Cat(String name) {
		super(name);
	}

	@Override
	public void bark() {
		System.out.println(this.getName()+":ίχίχ½Π");
		
	}

}
