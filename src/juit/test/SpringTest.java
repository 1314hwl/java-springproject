package juit.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.service.PersonService;
import cn.com.service.impl.PersonServiceBean;

public class SpringTest {

	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		PersonServiceBean bean = (PersonServiceBean) ctx.getBean("personService2");
		bean.save();
	}

}
