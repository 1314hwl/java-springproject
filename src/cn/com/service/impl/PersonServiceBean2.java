package cn.com.service.impl;

import cn.com.dao.PersonDao;
import cn.com.service.PersonService;

/**
 * @author HuWeiLiang
 * @Desc 依赖注入:无须在类中实例化pd，控制反转
 * @date 2017年5月22日
 * @time 上午11:36:46
 * @email:huweiliang@tydic.com
 */
public class PersonServiceBean2 implements PersonService {
	private PersonDao pd;

	public PersonDao getPd() {
		return pd;
	}

	public void setPd(PersonDao pd) {
		this.pd = pd;
	}

	@Override
	public void save() {
		System.out.println("save...");
		pd.add();
	}

}
