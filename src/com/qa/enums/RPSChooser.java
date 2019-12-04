package com.qa.enums;

import java.util.Random;

public class RPSChooser {
	static Random rand1 = new Random();
	static Random rand2 = new Random();
	static int CPU1 = rand1.nextInt(3);
	static int CPU2 = rand2.nextInt(3);


	public static int getCPU1() {
		return CPU1;
	}


	public static void setCPU1(int cPU1) {
		CPU1 = cPU1;
	}


	public static int getCPU2() {
		return CPU2;
	}


	public static void setCPU2(int cPU2) {
		CPU2 = cPU2;
	}
}
