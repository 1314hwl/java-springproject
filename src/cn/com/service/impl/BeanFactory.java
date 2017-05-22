package cn.com.service.impl;

/**
 * 
 * @author HuWeiLiang
 * @Desc 静态工厂获取bean
 * @date 2017年5月19日
 * @time 下午5:05:53
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
