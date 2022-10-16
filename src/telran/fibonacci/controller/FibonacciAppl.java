package telran.fibonacci.controller;

import telran.fibonacci.model.Fibonacci;

public class FibonacciAppl {

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci(8);
		int summ = 0;
		for (Integer num : fibonacci) {
			System.out.println(num);
		}
		for (Integer num : fibonacci) {
			summ += num;
		}
		System.out.println("Summ " + summ);
	}

}
