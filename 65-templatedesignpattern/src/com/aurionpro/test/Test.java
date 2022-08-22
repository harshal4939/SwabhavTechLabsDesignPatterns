package com.aurionpro.test;

import com.aurionpro.model.AdminPC;
import com.aurionpro.model.ClientPC;
import com.aurionpro.model.SystemTemplate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SystemTemplate obj1 = new ClientPC();
		obj1.buildComputer();
		
		System.out.println("--------------------------------");
		SystemTemplate obj2 = new AdminPC();
		obj2.buildComputer();
	}

}
