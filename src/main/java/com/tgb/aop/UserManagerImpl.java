package com.tgb.aop;


public class UserManagerImpl implements UserManager {

	@Override
	    public String findUserById(int userId) {  
	        System.out.println("---------UserManagerImpl.findUserById()--------");  
	        if (userId <= 0) {  
	            throw new IllegalArgumentException("该用户不存在!");   
	        }  
	        return "张三";  
	}
} 
