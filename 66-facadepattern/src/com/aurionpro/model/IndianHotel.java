package com.aurionpro.model;

public class IndianHotel implements IHotel{

	@Override
	public IMenu getMenu() {
		// TODO Auto-generated method stub
		return (IMenu) new IndianMenu();
	}

}
	