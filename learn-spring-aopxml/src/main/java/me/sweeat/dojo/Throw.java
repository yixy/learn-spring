package me.sweeat.dojo;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class Throw implements ThrowsAdvice {

    public void afterThrowing(Method method, Object[] args,Object target,Exception ex)throws Throwable{
        String describe=(String)args[0];
        System.out.println("------------>>>>>>>>>exception:"+ex.getMessage()+" . "+describe);
    }
}
