import java.util.Scanner;

public class Greaterofthree {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b= sc.nextInt();
        System.out.println("Enter third number");
        int c= sc.nextInt();
        if(a>b && a>c) {
        	System.out.println("first number "+a+" is greater than "+b+" and "+c);
        }
        else if(b>a && b>c) {
        	System.out.println("second number "+b+" is greater than "+a+" and "+c);
        }
        else {
        	System.out.println("third number "+c+" is greater than "+a+" and "+b);
        }
        
        sc.close();
			}
}
