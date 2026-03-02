package Core_Java.Switch;

import java.util.Scanner;

public class PerformOperation {
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1=100;
		int n2=20;
		System.out.println("which operation you want to perform\n"+"1.Addition\n"
		+"2.Substraction\n"+"3.Multiplication\n"+"4.Division\n");
		System.out.println("Enter Your Choice");
		
		char ch=sc.next().charAt(0);
		switch(ch) {
		case '+':
			int add=n1+n2;
			System.out.println(add);
			break;
		
		case '-':
			int sub=n1-n2;
			System.out.println(sub);
			break;
			
		case '*':
			int mul=n1*n2;
			System.out.println(mul);
			break;
			
		case '/':
			int div=n1/n2;
			System.out.println(div);
			break;
			
			default:
				System.out.println("invalid Choice");
			
		
		}
		}

}
