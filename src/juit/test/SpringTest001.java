package juit.test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.service.impl.PersonServiceBean;

/**
 * @author HuWeiLiang
 * @Desc
 * @date 2017年5月22日
 * @time 上午11:10:30
 * @email:huweiliang@tydic.com
 */
public class SpringTest001 {

	@Test
	public void test() {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		// 当bean的作用域scope为默认的singleton的时候，在ApplicationContext生成实例的时候就会实例化bean。
		// 可以在作用域scope为singleton的时候，可以设置lazy_init=true时延迟初始化(即不在创建容器的时候初始化)
		PersonServiceBean bean = (PersonServiceBean) ctx.getBean("personService");
		bean.save();
		ctx.close();
	}

}
