package com.brewin.service;

import com.brewin.entiry.Cat;

public class CatService implements AnimalService  {

	@Override
	public void bark() {
		new Cat("Èý»¨").bark();
	}

	

}
