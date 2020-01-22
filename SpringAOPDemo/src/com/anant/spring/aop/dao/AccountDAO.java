package com.anant.spring.aop.dao;

import org.springframework.stereotype.Component;

import com.anant.spring.aop.Account;

@Component
public class AccountDAO {

	public void addAccount(Account theAccount,boolean flag) {
		System.out.println("Hello! Spring AOP");
	}
	
	public void myAccount() {
		System.out.println("Account dao using myAccount method");
	}
}
