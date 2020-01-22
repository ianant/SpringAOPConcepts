package com.anant.spring.aop.dao;

import org.springframework.stereotype.Component;

import com.anant.spring.aop.Account;

@Component
public class AccountDAO {

	private String name;
	
	private String level;
	
	public void addAccount(Account theAccount,boolean flag) {
		System.out.println("Hello! Spring AOP");
	}
	
	public void myAccount() {
		System.out.println("Account dao using myAccount method");
	}

	public String getName() {
		System.out.println("inside get name");
		return name;
	}

	public void setName(String name) {
		System.out.println("inside set name");
		this.name = name;
	}

	public String getLevel() {
		System.out.println("inside get level");
		return level;
	}

	public void setLevel(String level) {
		System.out.println("inside set level");
		this.level = level;
	}
	
	
	
}
