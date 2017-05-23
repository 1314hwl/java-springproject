package juit.test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.aop.spring.dao.impl.CupDao;

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

public class SpringTest7 {

    @Test
    public void test() {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("bean7.xml");
        CupDao cup = (CupDao) ctx.getBean("cupServiceBean");
        cup.getName();
        // cup.drink();
        // cup.doPlay( "bb",1);
        ctx.close();
    }

}
