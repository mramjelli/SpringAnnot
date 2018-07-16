package com.spring.test2;

import org.springframework.beans.factory.annotation.Autowired;

public class SpringAnnot {
		private int animalName;
	
	private String animalType;
	@Autowired
	private SpringAnnot2 springAnnot;
	public SpringAnnot()
	{
		
		System.out.println("Inside SPringAnnot constructor ");
	}
	public int getAnimalName() {
		return animalName;
	}
	public void setAnimalName(int animalName) {
		this.animalName = animalName;
	}
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	public void display()
	{
		springAnnot.display2();
		System.out.println("Animal Name :" +animalName);
		System.out.println("Animal Type : " +animalType);

	}
	

}
