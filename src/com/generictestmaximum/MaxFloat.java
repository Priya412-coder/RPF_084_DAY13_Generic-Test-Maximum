package com.generictestmaximum;

public class MaxFloat {
	public Double FindMaxNumber(Double inputOne, Double inputTwo, Double inputThree) {
		if (inputOne.compareTo(inputTwo) > 0 && inputOne.compareTo(inputThree) > 0) {
			return inputOne;
		} else if (inputTwo.compareTo(inputOne) > 0 && inputTwo.compareTo(inputThree) > 0) {
			return inputTwo;
		} else {
			return inputThree;
		}
	}
}
