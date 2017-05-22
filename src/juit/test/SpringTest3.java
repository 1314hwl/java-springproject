package juit.test;

import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.service.PersonService2;
import cn.com.service.impl.PersonServiceBean3;

/**
 * @author HuWeiLiang
 * @Desc
 * @date 2017年5月22日
 * @time 上午11:10:30
 * @email:huweiliang@tydic.com
 */
public class SpringTest3 {

	@Test
	public void test() {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("bean3.xml");
		PersonService2 bean = (PersonService2) ctx.getBean("personService102");
		bean.save();
		Set<String> names = bean.getSets();
		System.out.println("###############set#################");
		for (String name : names) {
			System.out.println("name:" + name);
		}
		System.out.println("###############list#################");
		List<String> mobiles = bean.getMobiles();
		for (String m : mobiles) {
			System.out.println("mobile:" + m);
		}
		System.out.println("###############properties#################");
		for (Object key : bean.getP().keySet()) {
			System.out.println("key:" + (String) key + "  value:" + bean.getP().getProperty((String) key));
		}
		System.out.println("###############map#################");
		for (Object key : bean.getMaps().keySet()) {
			System.out.println("key:" + (String) key + "  value:" + bean.getMaps().get((String) key));
		}
		ctx.close();
	}

}
