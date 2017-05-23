package cn.com.aop.spring;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Description ����
 * @author HuWeiLiang
 * @date 2017��5��23�� ����2:36:51
 */
public class MyInterceptor {

    public void doBefore() {
        System.out.println("ǰ��֪ͨ");
    }

    public void doAfter() {
        System.out.println("����֪ͨ");
    }

    public void dofinal() {
        System.out.println("����֪ͨ");
    }

    public void doException() {
        System.out.println("����֪ͨ");
    }

    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("���뷽��");
        Object result = pjp.proceed();
        System.out.println("�˳�����");
        return result;
    }

}
