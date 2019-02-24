package me.sweeat.dojo;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class After implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target)
            throws Throwable {
        String describe=(String)args[0];
        System.out.println("------------>>>>>>>>>after:"+describe);
    }
}
