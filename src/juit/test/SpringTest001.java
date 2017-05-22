package juit.test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.service.impl.PersonServiceBean;

/**
 * @author HuWeiLiang
 * @Desc
 * @date 2017��5��22��
 * @time ����11:10:30
 * @email:huweiliang@tydic.com
 */
public class SpringTest001 {

	@Test
	public void test() {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		// ��bean��������scopeΪĬ�ϵ�singleton��ʱ����ApplicationContext����ʵ����ʱ��ͻ�ʵ����bean��
		// ������������scopeΪsingleton��ʱ�򣬿�������lazy_init=trueʱ�ӳٳ�ʼ��(�����ڴ���������ʱ���ʼ��)
		PersonServiceBean bean = (PersonServiceBean) ctx.getBean("personService");
		bean.save();
		ctx.close();
	}

}
