package com.springjdbc;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.EmpDao;
import com.spring.jdbc.entity.Employee;


/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext c;
	public static void main( String[] args )
    {
//      System.out.println( "Hello World!" );
    	
    	ApplicationContext c = new ClassPathXmlApplicationContext("com/springjdbc/config.xml");
    	EmpDao cd = c.getBean("EmpDao",EmpDao.class);
    	
    	Employee c1 = new Employee();
    	c1.setEid(270);
    	c1.setEname(" krishna");
    	c1.setDname("Accountant");
    	int r = cd.insert(c1);
    	System.out.println("Record inserted" +r);
    	
//        	
    	
    	

    }
}