package me.sweeat.dojo.service;

public class TestBean2 {
    public UserBean userBean;
    public  TestBean2(UserBean userBean){
        this.userBean= userBean;
    }
    public void echo(){
        userBean.echo();
    }
}
