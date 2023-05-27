package com.khadri.dp.facade;

public class TestFacadeDesignPattern {

	public static void main(String[] args) {
		ShopKeeperFacade facade = new ShopKeeperFacade();
		System.out.println(facade.askAppleDetails());
		System.out.println(facade.askOppoDetails());
		System.out.println(facade.askXiaomiDetails());
	}
}
