package me.sweeat.dojo.service;

public class TestBean {
    public UserBean userBean;
    public void setTestBean(UserBean userBean){
        this.userBean= userBean;
    }
    public void echo(){
        userBean.echo();
    }
}
