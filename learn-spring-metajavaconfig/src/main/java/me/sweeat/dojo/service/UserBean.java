package me.sweeat.dojo.service;

public class UserBean {
    private String name;

    public UserBean() {
        this.name="Merry";
    }

    public void echo(){
        System.out.println(this.name);
    }
}
