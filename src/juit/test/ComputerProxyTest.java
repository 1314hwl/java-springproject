package juit.test;

import org.junit.Test;

import cn.com.aop.jproxy.JDKProxyFactory;
import cn.com.aop.jproxy.dao.ComputerDao;
import cn.com.aop.jproxy.dao.impl.ComputerService;
import cn.com.aop.jproxy.modle.Computer;

public class ComputerProxyTest {

    @Test
    public void test() {
        Computer c = new Computer();
        c.setName("WATCH_DOG   ");
        c.setCountry("USA");
        ComputerDao realSubject = new ComputerService(c);

        JDKProxyFactory mJDKProxyFactory = new JDKProxyFactory();
        ComputerDao subject = (ComputerDao) mJDKProxyFactory.createProxyInstance(realSubject);
        subject.start();
        subject.stop();
    }

}
