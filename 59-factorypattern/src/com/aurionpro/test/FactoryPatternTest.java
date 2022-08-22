package com.aurionpro.test;
import java.util.Scanner;

import com.aurionpro.model.*;
public class FactoryPatternTest {

	public static void main(String[] args) {
		System.out.println("Choose the type of OS you want from the following :");
		System.out.println("1)Most Secure \t 2)Fastest \t 3)Most versatile. ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		OSFactory obj = new OSFactory();
		OS os = obj.getOSType(choice);
		
		//OS os = new Android();
		os.speciality();
	}

}
