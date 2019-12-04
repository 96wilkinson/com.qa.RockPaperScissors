package com.qa.enums;

public class Enums {
	public static enum Days {
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
		
	}
	public static void main(String[] args) {
		for (Days Days : Days.values()) {
		    System.out.println("The days in the week are: " + Days);
		}
	}

}
