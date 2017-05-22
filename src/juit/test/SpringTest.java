package juit.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.service.impl.PersonServiceBean;

/**
 * 
 * @author HuWeiLiang
 * @Desc 测试三种方式获取bean实例
 * @date 2017年5月22日
 * @time 上午10:42:52
 * @email:huweiliang@tydic.com
 */
public class SpringTest {

	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		// 1.普通方式获取PersonServiceBean
//		PersonServiceBean bean = (PersonServiceBean) ctx.getBean("personService");
//		bean.save();
		// 2.从类BeanFactory的createBean静态方法中获取bean
		// PersonServiceBean bean = (PersonServiceBean)
		// ctx.getBean("personService2");
		// bean.save();
		// 3.从类BeanFactory的createBean2方法中获取bean
		// PersonServiceBean bean = (PersonServiceBean)
		// ctx.getBean("personService3");
		// PersonServiceBean bean2 = (PersonServiceBean)
		// ctx.getBean("personService3");
		// System.out.println(bean==bean2);//默认情况bean是单例singleton的行为
		// bean.save();
	}

}
