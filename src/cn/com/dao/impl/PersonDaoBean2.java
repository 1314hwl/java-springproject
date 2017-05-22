package cn.com.dao.impl;

import org.springframework.stereotype.Repository;

import cn.com.dao.PersonDao2;

/**
 * 
 * @Description @Repository����spring����
 * @author HuWeiLiang
 * @date 2017��5��22�� ����5:55:18
 */
@Repository("yyyy")
public class PersonDaoBean2 implements PersonDao2 {

    @Override
    public void add() {
        System.out.println("add...");
    }

}
