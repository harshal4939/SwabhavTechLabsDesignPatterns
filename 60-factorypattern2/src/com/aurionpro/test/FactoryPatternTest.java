package com.aurionpro.test;

import com.aurionpro.model.AutoType;
import com.aurionpro.model.AutomobileFactory;
import com.aurionpro.model.IAutomobile;

public class FactoryPatternTest {

	public static void main(String[] args) {
		AutomobileFactory obj = new AutomobileFactory();
		IAutomobile bmw = obj.makeAutomobile(AutoType.BMW);
		bmw.start();
		bmw.stop();
		
		IAutomobile maruti = obj.makeAutomobile(AutoType.MARUTI);
		maruti.start();
		maruti.stop();
		

	}

}
