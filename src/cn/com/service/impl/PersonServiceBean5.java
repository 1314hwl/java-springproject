package cn.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cn.com.dao.PersonDao;
import cn.com.service.PersonService5;

/**
 * @author HuWeiLiang
 * @Desc 1.�ֶ�ע�룺ͨ��ע��ע��@Resource:������װ�� ��@AutoWrite��������װ�� @Qualifier������ע��
 *       required=false����ʾ 2.�Զ�ע��(���Ƽ�)
 * @date 2017��5��22��
 * @time ����11:36:46
 * @email:huweiliang@tydic.com
 */
public class PersonServiceBean5 implements PersonService5 {

    // @Resource(name = "pdb")
    @Autowired(required = false)
    @Qualifier("pdb")
    private PersonDao personDao;

    @Override
    public void save() {
        personDao.add();
    }

}
