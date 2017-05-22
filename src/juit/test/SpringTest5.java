package juit.test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.service.PersonService5;

/**
 * @author HuWeiLiang
 * @Desc
 * @date 2017年5月22日
 * @time 上午11:10:30
 * @email:huweiliang@tydic.com
 */

public class SpringTest5 {

	@Test
	public void test() {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("bean5.xml");
		PersonService5 bean = (PersonService5) ctx.getBean("personService105");
		bean.save();
		ctx.close();
	}

}
