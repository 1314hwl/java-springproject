package juit.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.service.impl.PersonServiceBean;

/**
 * 
 * @author HuWeiLiang
 * @Desc �������ַ�ʽ��ȡbeanʵ��
 * @date 2017��5��22��
 * @time ����10:42:52
 * @email:huweiliang@tydic.com
 */
public class SpringTest {

	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		// 1.��ͨ��ʽ��ȡPersonServiceBean
//		PersonServiceBean bean = (PersonServiceBean) ctx.getBean("personService");
//		bean.save();
		// 2.����BeanFactory��createBean��̬�����л�ȡbean
		// PersonServiceBean bean = (PersonServiceBean)
		// ctx.getBean("personService2");
		// bean.save();
		// 3.����BeanFactory��createBean2�����л�ȡbean
		// PersonServiceBean bean = (PersonServiceBean)
		// ctx.getBean("personService3");
		// PersonServiceBean bean2 = (PersonServiceBean)
		// ctx.getBean("personService3");
		// System.out.println(bean==bean2);//Ĭ�����bean�ǵ���singleton����Ϊ
		// bean.save();
	}

}
