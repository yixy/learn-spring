package me.sweeat.dojo;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        ResourcePatternResolver resolver=new PathMatchingResourcePatternResolver();
        Resource[] rs=resolver.getResources("classpath*:test.txt");

        //在项目发布时，如果资源配置文件会被打包到 JAR 中，不建议使用 Resource#getFile() 方法，应尽量采用流的方式来读取配置文件，因为它总是有效的。
        /*
        File file=rs.getFile();
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String str = reader.readLine();
        while (str != null) {
            System.out.println(str);
            str = reader.readLine();
        }
        */
        //注意，classpath*这种形式的参数，不能用在getResource方法中，应该使用getResources方法。
        for(Resource r:rs){
            InputStream is=r.getInputStream();
            int data = is.read();
            while(data != -1) {
                System.out.print((char) data);
                data = is.read();
            }
            is.close();
        }

    }

}
