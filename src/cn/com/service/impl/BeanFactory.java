package cn.com.service.impl;

/**
 * 
 * @author HuWeiLiang
 * @Desc ��̬������ȡbean
 * @date 2017��5��19��
 * @time ����5:05:53
 * @email:huweiliang@tydic.com
 */
public class BeanFactory {

	public static PersonServiceBean createBean() {
		return new PersonServiceBean();
	}

	public PersonServiceBean createBean2() {
		return new PersonServiceBean();
	}
}
