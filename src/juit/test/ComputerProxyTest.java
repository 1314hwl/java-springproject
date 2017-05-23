package juit.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.junit.Test;

import cn.com.aop.jproxy.ComputerProxy;
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

        // ����Ҫ�����ĸ���ʵ���󣬾ͽ��ö��󴫽�ȥ�������ͨ������ʵ�����������䷽����
        InvocationHandler handler = new ComputerProxy(realSubject);

        /*
         * ͨ��Proxy��newProxyInstance�������������ǵĴ�������������������������� ��һ������
         * handler.getClass().getClassLoader()
         * ����������ʹ��handler������ClassLoader�������������ǵĴ������
         * �ڶ�������realSubject.getClass().getInterfaces()����������Ϊ��������ṩ�Ľӿ�����ʵ������ʵ�еĽӿ�
         * ����ʾ��Ҫ������Ǹ���ʵ���������Ҿ��ܵ�������ӿ��еķ����� ����������handler�� �������ｫ������������������Ϸ���
         * InvocationHandler ���������
         */
        ComputerDao subject = (ComputerDao) Proxy.newProxyInstance(handler.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(), handler);
        subject.start();
        subject.stop();
    }

}
