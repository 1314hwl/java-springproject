package cn.com.service.impl;

import cn.com.dao.PersonDao;
import cn.com.service.PersonService4;

/**
 * @author HuWeiLiang
 * @Desc 构造器构造函数注入
 * @date 2017年5月22日
 * @time 上午11:36:46
 * @email:huweiliang@tydic.com
 */
public class PersonServiceBean4 implements PersonService4 {

	private String name;
	private int age;
	private PersonDao personDao;

	public PersonServiceBean4(String name, int age, PersonDao personDao) {
		this.name = name;
		this.age = age;
		this.personDao = personDao;
	}

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void save() {
		System.out.println("save...name:" + getName() + " age:" + getAge());
		personDao.add();
	}

}
