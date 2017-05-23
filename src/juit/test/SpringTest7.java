package juit.test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.aop.spring.dao.impl.CupDao;

/**
 * @author HuWeiLiang
 * @Desc 表达式 :expression<br>
 *       1.拦截返回值为string类型的方法："execution(java.lang.String
 *       cn.com.aop.spring.dao.impl.CupServiceBean.*(..))"<br>
 *       2.拦截所有的方法："execution(*
 *       cn.com.aop.spring.dao.impl.CupServiceBean.*(..))"<br>
 *       3.拦截第一个参数为String的方法:"execution(*
 *       cn.com.aop.spring.dao.impl.CupServiceBean.*(java.lang.String,..))"<br>
 *       4.拦截有返回值的方法："execution(!void
 *       cn.com.aop.spring.dao.impl.CupServiceBean.*(..))"
 * @date 2017年5月22日
 * @time 上午11:10:30
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
