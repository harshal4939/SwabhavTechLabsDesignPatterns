package com.aurionpro.test;

import com.aurionpro.model.*;

public class FactoryPatternTest {

	public static void main(String[] args) {
		IAutomobileFactory factory = BmwFactory.getInstance();
		IAutomobile bmw = factory.makeAutomobile();
		bmw.start();
		bmw.stop();
		System.out.println(factory.hashCode());

		IAutomobileFactory factory1 = BmwFactory.getInstance();
		IAutomobile bmw1 = factory1.makeAutomobile();
		bmw1.start();
		bmw1.stop();
		System.out.println(factory1.hashCode());
	}

}
