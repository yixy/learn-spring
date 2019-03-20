package me.sweeat.dojo;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            //从 classpath 获取配置文件，初始化ApplicationContext。等价于classpath*:mybeans.xml
            ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:my-datasource.xml");
            BasicDataSource dbcp=(BasicDataSource)context.getBean("dsdbcp");
            Connection a=dbcp.getConnection();
            ComboPooledDataSource c3p0=(ComboPooledDataSource)context.getBean("dsc3p0");
            Connection b=c3p0.getConnection();
            DriverManagerDataSource dm= (DriverManagerDataSource)context.getBean("dsdrivermanager");
            Connection c=dm.getConnection();

            PreparedStatement stm=a.prepareStatement("select * from TEST");
            ResultSet result=  stm.executeQuery();
            while(result.next()){
                System.out.println(result.getInt(1));
                System.out.println(result.getString(2));
            }

            stm=b.prepareStatement("select * from TEST");
            result=  stm.executeQuery();
            while(result.next()){
                System.out.println(result.getInt(1));
                System.out.println(result.getString(2));
            }

            stm=c.prepareStatement("select * from TEST");
            result=  stm.executeQuery();
            while(result.next()){
                System.out.println(result.getInt(1));
                System.out.println(result.getString(2));
            }
        }catch (Exception e){
            System.out.println("DataSource Exception!"+e.getMessage() );
        }

    }
}
