package com.aurionpro.model;

public class OSFactory {

	public OS getOSType(int choice) {
		switch (choice) {
		case 1:
			return new Ios();
		case 2:
			return new Android();
		case 3:
			return new Windows();
		default:
			System.out.println("Invalid selection; We have selected the default OS as Windows");
			return new Windows();
		}
	}
}
