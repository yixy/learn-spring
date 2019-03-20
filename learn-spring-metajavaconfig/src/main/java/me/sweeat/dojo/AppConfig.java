package me.sweeat.dojo;

import me.sweeat.dojo.service.TestBean;
import me.sweeat.dojo.service.TestBean2;
import me.sweeat.dojo.service.UserBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public UserBean userBean(){
        return new UserBean();
    }

    @Bean
    public TestBean testBean(){
        TestBean testBean=new TestBean();
        testBean.setTestBean(userBean());
        return testBean;
    }

    @Bean
    public TestBean2 testBean2(){
        TestBean2 testBean2=new TestBean2(userBean());
        return testBean2;
    }

}
