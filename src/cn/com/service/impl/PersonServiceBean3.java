package cn.com.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import cn.com.service.PersonService2;

/**
 * @author HuWeiLiang
 * @Desc 基本类型的注入:String ,int ,set,list,properties,
 * @date 2017年5月22日
 * @time 上午11:36:46
 * @email:huweiliang@tydic.com
 */
public class PersonServiceBean3 implements PersonService2 {

	private String name;
	private int age;
	private Set<String> sets;
	private List<String> mobiles;
	private Properties p;
	private Map<String, String> maps;

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
	public Set<String> getSets() {
		return sets;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	@Override
	public List<String> getMobiles() {
		return mobiles;
	}

	public void setMobiles(List<String> mobiles) {
		this.mobiles = mobiles;
	}

	@Override
	public Properties getP() {
		return p;
	}

	public void setP(Properties p) {
		this.p = p;
	}

	@Override
	public Map<String, String> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}

	@Override
	public void save() {
		System.out.println("save...name:" + getName() + " age:" + getAge());
	}

}
