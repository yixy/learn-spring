package me.sweeat.dojo;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class IntroductionIntercept extends DelegatingIntroductionInterceptor
    implements FlagInt {
    //解决线程安全问题
    private ThreadLocal<Boolean> FlagMap=new ThreadLocal<Boolean>();
    @Override
    public void setFlag(String flag) {
        if(flag!=null&&"enable".equals(flag)){
            FlagMap.set(true);
        }else{
            FlagMap.set(false);
        }
    }

    public Object invoke(MethodInvocation mi)throws Throwable{
        Object obj=null;
        if(FlagMap.get()!=null && FlagMap.get()){
            System.out.println("------------>>>>>>>>>DelegatingIntroductionInterceptor");
        }
        obj=super.invoke(mi);
        return obj;
    }
}
