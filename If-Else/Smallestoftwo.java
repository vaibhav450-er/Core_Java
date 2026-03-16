import java.util.*;
public class Smallestoftwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b= sc.nextInt();
        if(a<b) {
        	System.out.println("first number "+a+" is smaller than "+b);
        }
        else {
        	System.out.println("second number "+b+" is smaller than "+a);
        }
        
        sc.close();
}

}
