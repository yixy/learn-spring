package me.sweeat.dojo;

public class Target {
    public void doSomething(String describe){
        System.out.println("me.sweeat.dojo.Target.doSomething. "+ describe);
    }
    public void noAop() {System.out.println("me.sweeat.dojo.Target.noAop. ");}
}
