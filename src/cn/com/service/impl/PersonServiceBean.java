package cn.com.service.impl;

import cn.com.service.PersonService;

public class PersonServiceBean implements PersonService {
	
	public void init(){
		System.out.println("��ʼ��...");
	}

	public PersonServiceBean(){
		System.out.println("�ұ�ʵ������...");
	}
	
	
	@Override
	public void save() {
		System.out.println("save...");
	}
	
	public void destory(){
		System.out.println("�رմ򿪵���Դ...");
	}

}
