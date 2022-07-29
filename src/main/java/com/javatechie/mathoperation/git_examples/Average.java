package com.javatechie.mathoperation.git_examples;

public class Average {

	private int value1;
	private int value2;
	private int value3;

	public Average(int value1, int value2, int value3) {
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;

	}

	public int average() {
		return (value1 + value2 + value3)/3;
	}
}
