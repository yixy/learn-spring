package me.sweeat.dojo;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class TestBean implements FactoryBean<Time> {
    @Override
    public Time getObject() throws Exception {
        Time t=new Time();
        return t;
    }

    @Override
    public Class<Time> getObjectType() {
        return Time.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
