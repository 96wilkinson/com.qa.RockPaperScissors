package com.qa.enums;

public class RPSgame {
	static RPSoptions result1;
	static RPSoptions result2;
	static String  result3 = "";
 
	public static String choosing() { 
	//split choosing method into 3 different parts using	
	//	int numb = RPSChooser.getN1();
	
		
	if (RPSChooser.getCPU1() == 0) {
		result1 = RPSoptions.ROCK;
		
		if (RPSChooser.getCPU2() == 0) {
			result2 = RPSoptions.ROCK;
			return result3 = "Draw";
			
		}
		if (RPSChooser.getCPU2() == 1) {
			result2 = RPSoptions.PAPER;
			return result3 = "Paper Wins!";
		}
		if (RPSChooser.getCPU2() == 2) {
			result2 = RPSoptions.SCISSORS;
			return result3 = "Rock Wins!";
		}
	}
	if (RPSChooser.getCPU1() == 1 ) {
		result1 = RPSoptions.PAPER;
		if (RPSChooser.getCPU2() == 0) {
			result2 = RPSoptions.ROCK;
			return result3 = "Paper Wins!";
		}
		if (RPSChooser.getCPU2() == 1) {
			result2 = RPSoptions.PAPER;
			return result3 = "Draw";
		}
		if (RPSChooser.getCPU2() == 2) {
			result2 = RPSoptions.SCISSORS;
			return result3 = "Scissors Wins!";
		}
		
	}
	if (RPSChooser.getCPU1() == 2) { 
		result1 = RPSoptions.SCISSORS;
		if (RPSChooser.getCPU2() == 0) {
			result2 = RPSoptions.ROCK;
			return result3 = "Rock Wins!";
		}
		if (RPSChooser.getCPU2() == 1) {
			result2 = RPSoptions.PAPER;
			return result3 = "Scissors Wins!";
		}
		if (RPSChooser.getCPU2() == 2) {
			result2 = RPSoptions.SCISSORS;
			return result3 = "Draw";
		}
	}
	return result3;
	}

	public static RPSoptions getResult1() {
		return result1;
	}

	public static void setResult1(RPSoptions result1) {
		RPSgame.result1 = result1;
	}

	public static RPSoptions getResult2() {
		return result2;
	}

	public static void setResult2(RPSoptions result2) {
		RPSgame.result2 = result2;
	}

	public static String getResult3() {
		return result3;
	}

	public static void setResult3(String result3) {
		RPSgame.result3 = result3;
	}


	
	
	
}


