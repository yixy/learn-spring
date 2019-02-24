package me.sweeat.dojo;

public class Target{
    public void doSomething(String describe){
        System.out.println("me.sweeat.dojo.Target.doSomething. "+ describe);
    }
    public void doSomethingEx(String describe) {
        System.out.println("call me.sweeat.dojo.Target.doSomethingEx. "+describe);
            throw new RuntimeException("There is an exception..................");
    }

}
