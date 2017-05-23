package cn.com.aop.jproxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import cn.com.aop.jproxy.dao.impl.ComputerService2;

/**
 * @Description CGlib的方式实现代理
 * @author HuWeiLiang
 * @date 2017年5月23日 上午10:48:13
 */
public class CGlibProxyFactory implements MethodInterceptor {
    private Object targetObj;

    public Object createProxyInstance(Object targetObj) {
        this.targetObj = targetObj;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.targetObj.getClass());
        enhancer.setCallback(this);
        return enhancer.create();

    }

    @Override
    public Object intercept(Object arg0, Method method, Object[] arg2, MethodProxy arg3) throws Throwable {
        ComputerService2 bean = (ComputerService2) this.targetObj;
        Object result = null;
        if (null != bean.getC()) {
            result = method.invoke(targetObj, arg2);
        }
        return null;
    }

}
