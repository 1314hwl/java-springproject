package cn.com.dao.impl;

import org.springframework.stereotype.Repository;

import cn.com.dao.PersonDao2;

/**
 * 
 * @Description @Repository交给spring管理
 * @author HuWeiLiang
 * @date 2017年5月22日 下午5:55:18
 */
@Repository("yyyy")
public class PersonDaoBean2 implements PersonDao2 {

    @Override
    public void add() {
        System.out.println("add...");
    }

}
