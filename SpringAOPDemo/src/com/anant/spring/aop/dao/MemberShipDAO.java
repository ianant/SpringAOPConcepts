package com.anant.spring.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MemberShipDAO {

	public void addAccount() {
		System.out.println("::: Adding account in membership DAO class");
	}
	
	public void memberShip() {
		System.out.println("membership dao");
	}
}
