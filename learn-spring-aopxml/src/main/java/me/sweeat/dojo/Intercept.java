package me.sweeat.dojo;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Intercept implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object[] args=invocation.getArguments();
        String describe=(String)args[0];
        System.out.println("------------>>>>>>>>>intercept before:"+describe);
        Object obj = invocation.proceed();
        System.out.println("------------>>>>>>>>>intercept after:"+describe);
        return obj;
    }
}
