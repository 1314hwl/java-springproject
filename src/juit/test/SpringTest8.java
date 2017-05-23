package juit.test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.aop.spring.dao.impl.CupDao;
import cn.com.jdbc.spring.dao.UserDao;
import cn.com.jdbc.spring.modle.User;

/**
 * @author HuWeiLiang
 * @Desc ���ʽ :expression<br>
 *       1.���ط���ֵΪstring���͵ķ�����"execution(java.lang.String
 *       cn.com.aop.spring.dao.impl.CupServiceBean.*(..))"<br>
 *       2.�������еķ�����"execution(*
 *       cn.com.aop.spring.dao.impl.CupServiceBean.*(..))"<br>
 *       3.���ص�һ������ΪString�ķ���:"execution(*
 *       cn.com.aop.spring.dao.impl.CupServiceBean.*(java.lang.String,..))"<br>
 *       4.�����з���ֵ�ķ�����"execution(!void
 *       cn.com.aop.spring.dao.impl.CupServiceBean.*(..))"
 * @date 2017��5��22��
 * @time ����11:10:30
 * @email:huweiliang@tydic.com
 */

public class SpringTest8 {

    @Test
    public void test() {

    }

    @Test
    public void testSave() {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc_bean2.xml");
        UserDao ud = (UserDao) ctx.getBean("userSerivceBean");
        User u = new User();
        u.setId(1);
        u.setName("zhangsan");
        u.setPassword("000000");
        ud.save(u);
        ctx.close();
    }

    @Test
    public void update() {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc_bean2.xml");
        UserDao ud = (UserDao) ctx.getBean("userSerivceBean");
        User u = new User();
        u.setId(1);
        u.setName("lisi");
        u.setPassword("123456");
        ud.update(u);
        ctx.close();
    }

    @Test
    public void getAll() {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc_bean2.xml");
        UserDao ud = (UserDao) ctx.getBean("userSerivceBean");
        for (User u : ud.getAllUser()) {
            System.out.println(u.toString());
        }
        ctx.close();
    }

    @Test
    public void delete() {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc_bean2.xml");
        UserDao ud = (UserDao) ctx.getBean("userSerivceBean");
        ud.deleteUserById(0);
        ctx.close();
    }

}
