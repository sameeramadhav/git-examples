package com.javatechie.mathoperation.git_examples;

public class MathOperation {

	public static void main(String args[]) {
		Add add = new Add(5, 5, 5);
		System.out.println("Addition =" + add.sum());
		Sub sub = new Sub(10, 5);
		System.out.println("Subtraction =" + sub.difference());
		Multiply multiply = new Multiply(10, 10);
		System.out.println("Multiplication =" + multiply.product());
		Divide divide = new Divide(10,5);
		System.out.println("Division =" + divide.quotient());
	}

}
