package com.aurionpro.model;

public abstract class SystemTemplate {
	public final void buildComputer() {
		collectComponents();
		assembleComponents();
		installOS();
		installSoftwares();
		System.out.println("Computer booted successfully");
	}

	abstract void installSoftwares();

	abstract void installOS();

	private void assembleComponents() {
		// TODO Auto-generated method stub
		System.out.println("Assembling the CPU and other components");
	}

	private void collectComponents() {
		// TODO Auto-generated method stub
		System.out.println("Collecting the necessary components");
	}

}
