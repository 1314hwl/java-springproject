package cn.com.aop.jproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import cn.com.aop.jproxy.dao.impl.ComputerService;

public class ComputerProxy implements InvocationHandler {

    private Object realObj;

    public ComputerProxy(Object realObj) {
        this.realObj = realObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (realObj instanceof ComputerService) {
            ComputerService c = (ComputerService) realObj;
            if (null != c.getC()) {
                method.invoke(realObj, args);
            }
        }
        return null;
    }

}
