package cn.com.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import cn.com.dao.PersonDao;
import cn.com.service.PersonService6;

/**
 * @author HuWeiLiang
 * @Desc @Service @Scope:prototype(�ǵ���) @PostConstruct��ʼ�� 
 * @date 2017��5��22��
 * @time ����11:36:46
 * @email:huweiliang@tydic.com
 */
@Service("xxxx")
@Scope("prototype")
public class PersonServiceBean6 implements PersonService6 {

    private PersonDao personDao;

    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    @PostConstruct
    private void init() {
        System.out.println("��ʼ��...");

    }

    @PreDestroy
    private void destory() {
        System.out.println("�ͷ���Դ...");
    }

    @Override
    public void save() {
        personDao.add();
    }

}
