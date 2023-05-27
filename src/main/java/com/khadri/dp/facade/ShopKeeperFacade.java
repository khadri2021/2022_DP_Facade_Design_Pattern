package com.khadri.dp.facade;

public class ShopKeeperFacade {

	MultiMobileShop apple = new Apple();
	MultiMobileShop xiaomi = new Xioami();
	MultiMobileShop oppo = new Oppo();

	public String askAppleDetails() {
		return apple.mobileDetails();
	}

	public String askXiaomiDetails() {
		return xiaomi.mobileDetails();
	}

	public String askOppoDetails() {
		return oppo.mobileDetails();
	}

}
