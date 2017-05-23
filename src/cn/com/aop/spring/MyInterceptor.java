package cn.com.aop.spring;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Description 切面
 * @author HuWeiLiang
 * @date 2017年5月23日 下午2:36:51
 */
public class MyInterceptor {

    public void doBefore() {
        System.out.println("前置通知");
    }

    public void doAfter() {
        System.out.println("后置通知");
    }

    public void dofinal() {
        System.out.println("最终通知");
    }

    public void doException() {
        System.out.println("例外通知");
    }

    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("进入方法");
        Object result = pjp.proceed();
        System.out.println("退出方法");
        return result;
    }

}
