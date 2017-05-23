package juit.test;

import org.junit.Test;

import cn.com.aop.jproxy.CGlibProxyFactory;
import cn.com.aop.jproxy.dao.impl.ComputerService2;
import cn.com.aop.jproxy.modle.Computer;

public class CglibProxyTest2 {

    @Test
    public void test() {
        Computer c = new Computer();
        c.setName("WATCH_DOG   ");
        c.setCountry("USA");
        ComputerService2 realSubject = new ComputerService2(c);
        CGlibProxyFactory f = new CGlibProxyFactory();
        ComputerService2 mComputerService2 = (ComputerService2) f.createProxyInstance(realSubject);
        mComputerService2.start();
    }

}
