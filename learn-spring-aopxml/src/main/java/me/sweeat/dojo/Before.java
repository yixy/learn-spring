package me.sweeat.dojo;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Before implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) {
        String describe=(String)objects[0];
        System.out.println("------------>>>>>>>>>before:"+describe);
    }
}
