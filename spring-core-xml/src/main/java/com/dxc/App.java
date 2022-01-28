package com.dxc;

import com.dxc.dao.AppDao;
import com.dxc.dao.AppDataSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        AppDataSource appDataSource=ctx.getBean("dataSource",AppDataSource.class);
         //ctx.refresh();
        //AppDao appDao = ctx.getBean("appDao", AppDao.class);
        System.out.println(appDataSource);
        ctx.registerShutdownHook();
        /*System.out.println("hi");
        AppDataSource appDataSource=new AppDataSource();*/
    }
}