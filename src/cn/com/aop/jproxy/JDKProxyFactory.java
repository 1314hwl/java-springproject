package cn.com.aop.jproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import cn.com.aop.jproxy.dao.impl.ComputerService;

/**
 * <p>
 * AOP的概念：切面<br>
 * 1.Aspect切面，横切面关注点的抽象的过程：例子中代理的实现过程</br>
 * 2.连接点：例子中被拦截到的业务方法，被拦截的点</br>
 * 3.切入点：例子中需要拦截的业务方法就是切入点</br>
 * 4.通知<环绕通知>：前置通知，后置通知，例外通知，最终通知</br>
 * 5.目标对象:例子中的ComputerService</br>
 * 6.织入：把切面应用到目标对象的过程</br>
 * 7.引入</br>
 * </p>
 * 
 * @Description
 * @author HuWeiLiang
 * @date 2017年5月23日 上午11:08:29
 */
public class JDKProxyFactory implements InvocationHandler {

    private Object targetObj;

    public Object createProxyInstance(Object targetObj) {
        this.targetObj = targetObj;
        return Proxy.newProxyInstance(this.targetObj.getClass().getClassLoader(),
                this.targetObj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxyObj, Method method, Object[] args) throws Throwable {
        // 环绕通知：前置通知，后置通知，例外通知，最终通知
        ComputerService mComputerService = (ComputerService) this.targetObj;
        Object result = null;
        if (mComputerService.getC() != null) {
            try {
                // before notifcation... 前置通知
                result = method.invoke(targetObj, args);
                // after notifcation... 后置通知
            } catch (Exception e) {
                e.printStackTrace();
                // exception notifcation 例外通知
            } finally {
                // exception notifcation 最终通知
            }
        }
        return result;
    }
}
