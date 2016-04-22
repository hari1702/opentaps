package week1;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {

		//capture the input in an integer
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a number");
		int num = sc.nextInt();
		
		//Returns results based on the boolean value sent from isPrime method
		PrimeNumber primeNum = new PrimeNumber();
		
		if (primeNum.isPrime(num)){
			System.out.printf("\n Result: The number %d is a prime number",num);
		}else{
			System.out.printf("\n Result: The number %d is not a prime number",num);
		}
	}
		
		//Method to check whether given number is prime or not, return true or false
		public boolean isPrime(int num) {
			if (num<2) return false;
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		}
		
	
	}
