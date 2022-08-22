package com.aurionpro.model;

public class HotelReception {
	public void getIndianMenu(){
		IHotel indHotel = new IndianHotel();
		IMenu indmenu = indHotel.getMenu();
		indmenu.showMenu();
		
	};
	public void getChineseMenu() {
		IHotel chnHotel = new ChineseHotel();
		IMenu chnmenu = chnHotel.getMenu();
		chnmenu.showMenu();	
	}
	public void getItalianMenu(){
		IHotel itlHotel = new ItalianHotel();
		IMenu itlmenu = itlHotel.getMenu();
		itlmenu.showMenu();
	}
}
