package cn.com.service.impl;

import cn.com.service.PersonService;

public class PersonServiceBean implements PersonService {

	@Override
	public void save() {
		System.out.println("save...");
	}

}
