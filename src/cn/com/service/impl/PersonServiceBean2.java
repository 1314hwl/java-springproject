package cn.com.service.impl;

import cn.com.dao.PersonDao;
import cn.com.service.PersonService;

/**
 * @author HuWeiLiang
 * @Desc ����ע��:����������ʵ����pd�����Ʒ�ת
 * @date 2017��5��22��
 * @time ����11:36:46
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
