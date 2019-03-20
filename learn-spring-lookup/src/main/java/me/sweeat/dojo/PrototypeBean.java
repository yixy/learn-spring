package me.sweeat.dojo;

public class PrototypeBean {
    private long time;
    public PrototypeBean(){
        this.time=System.currentTimeMillis();
    }
    public void echo(){System.out.println(time);}
}
