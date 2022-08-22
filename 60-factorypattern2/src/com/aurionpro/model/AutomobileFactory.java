package com.aurionpro.model;

public class AutomobileFactory {
	public IAutomobile makeAutomobile(AutoType at) {
		if (at == AutoType.BMW) {
			return new Bmw();
		} else if (at == AutoType.TESLA) {
			return new Tesla();
		} else {
			return new Maruti();
		}

	}
}
