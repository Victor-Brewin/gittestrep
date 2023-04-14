package com.brewin.entiry;

import com.brewin.service.Action;

public class Horse extends Animal implements Action {

	public Horse(String name) {
		super(name);
	}

	@Override
	public void bark() {
		System.out.println(this.getName()+":ТэНа");

	}

}
