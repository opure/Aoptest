package com.journaldev.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.journaldev.spring.service.EmployeeService;
import com.tgb.aop.UserManager;
import com.tgb.aop.UserManagerImpl;

public class SpringMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
/*		UserManager userManager = ctx.getBean("userManager", UserManager.class);
        
        //可以查找张三  
        userManager.findUserById(1);  
          
        System.out.println("=====我==是==分==割==线=====");  
  
        try {  
            // 查不到数据，会抛异常，异常会被AfterThrowingAdvice捕获  
            userManager.findUserById(0);  
        } catch (IllegalArgumentException e) {  
        }  */
		
		System.out.println(employeeService.getEmployee().getName());
		
		employeeService.getEmployee().setName("Pankaj");
		
		employeeService.getEmployee().throwException();
		
		ctx.close();
	}

}
