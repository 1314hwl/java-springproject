package cn.com.service.impl;

import cn.com.service.PersonService;

public class PersonServiceBean implements PersonService {
	
	public void init(){
		System.out.println("初始化...");
	}

	public PersonServiceBean(){
		System.out.println("我被实例化了...");
	}
	
	
	@Override
	public void save() {
		System.out.println("save...");
	}
	
	public void destory(){
		System.out.println("关闭打开的资源...");
	}

}
