package cn.com.aop.jproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import cn.com.aop.jproxy.dao.impl.ComputerService;

/**
 * <p>
 * AOP�ĸ������<br>
 * 1.Aspect���棬�������ע��ĳ���Ĺ��̣������д����ʵ�ֹ���</br>
 * 2.���ӵ㣺�����б����ص���ҵ�񷽷��������صĵ�</br>
 * 3.����㣺��������Ҫ���ص�ҵ�񷽷����������</br>
 * 4.֪ͨ<����֪ͨ>��ǰ��֪ͨ������֪ͨ������֪ͨ������֪ͨ</br>
 * 5.Ŀ�����:�����е�ComputerService</br>
 * 6.֯�룺������Ӧ�õ�Ŀ�����Ĺ���</br>
 * 7.����</br>
 * </p>
 * 
 * @Description
 * @author HuWeiLiang
 * @date 2017��5��23�� ����11:08:29
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
        // ����֪ͨ��ǰ��֪ͨ������֪ͨ������֪ͨ������֪ͨ
        ComputerService mComputerService = (ComputerService) this.targetObj;
        Object result = null;
        if (mComputerService.getC() != null) {
            try {
                // before notifcation... ǰ��֪ͨ
                result = method.invoke(targetObj, args);
                // after notifcation... ����֪ͨ
            } catch (Exception e) {
                e.printStackTrace();
                // exception notifcation ����֪ͨ
            } finally {
                // exception notifcation ����֪ͨ
            }
        }
        return result;
    }
}
