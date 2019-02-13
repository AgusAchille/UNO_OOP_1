package b_control;

import java.util.*;

public class Main_09 {
	public static void main(String[] args) {
		int n = 10;
		printPrime(n);
		
	}

	//function check if 
	//a number is prime or not 
	static boolean isPrime(int n) {
		if (n <= 1)
			return false;

		//Check from 2 to n-1 
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}

	//Function to print primes 
	static void printPrime(int n) {
		int counter=0;
		for (int i = 2; counter<n ; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				counter++;
			}
		}
	}
	
	
	
}