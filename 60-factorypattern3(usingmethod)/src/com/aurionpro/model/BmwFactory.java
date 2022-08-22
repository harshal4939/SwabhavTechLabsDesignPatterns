package com.aurionpro.model;

public class BmwFactory implements IAutomobileFactory {
	private static BmwFactory instance = null;
	private BmwFactory() {
	};

	public static BmwFactory getInstance() {
		if (instance == null)
			instance = new BmwFactory();

		return instance;
	}

	@Override
	public IAutomobile makeAutomobile() {
		// TODO Auto-generated method stub
		return new Bmw();
	}

}
