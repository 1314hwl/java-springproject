package juit.test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.service.impl.PersonServiceBean2;

/**
 * @author HuWeiLiang
 * @Desc
 * @date 2017年5月22日
 * @time 上午11:10:30
 * @email:huweiliang@tydic.com
 */
public class SpringTest002 {

	@Test
	public void test() {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("bean2.xml");
		PersonServiceBean2 bean = (PersonServiceBean2) ctx.getBean("personService101");
		bean.save();
		ctx.close();
	}

}
