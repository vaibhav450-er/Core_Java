// Q1)Write a Java program to check whether a given number is positive, negative, or zero.

import java.util.*;
public class Positiveornegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("Number is negative");
		}
		else if(n>0) {
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is Zero");
		}
			}
}
