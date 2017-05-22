package juit.test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.service.PersonService6;

/**
 * @author HuWeiLiang
 * @Desc
 * @date 2017年5月22日
 * @time 上午11:10:30
 * @email:huweiliang@tydic.com
 */

public class SpringTest6 {

    @Test
    public void test() {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("bean6.xml");
        PersonService6 bean = (PersonService6) ctx.getBean("xxxx");
//        PersonService6 bean1 = (PersonService6) ctx.getBean("xxxx");
//        System.out.println(bean == bean1);
        // PersonDao2 pd2 = (PersonDao2) ctx.getBean("yyyy");
        // System.out.println(pd2);
        ctx.close();
    }

}
