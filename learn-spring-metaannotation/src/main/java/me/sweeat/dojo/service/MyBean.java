package me.sweeat.dojo.service;

import org.springframework.stereotype.Service;

@Service("a")
public class MyBean {
    private String ID;
    private String Name;
    public String getID() {
        return ID;
    }
    public String getName() {
        return Name;
    }
    public MyBean() {
        ID = "1";
        Name = "Tom";
    }
}
