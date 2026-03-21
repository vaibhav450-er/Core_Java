import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter units");
        int unit=sc.nextInt();
        int bill;
        if(unit<=100) {
        	bill=unit*1;
        	System.out.println("Your bill is = "+bill+" RS");
        	
        }
        else if(unit>100 && unit<=200) {
        	bill=unit*2;
        	System.out.println("Your bill is = "+bill+" RS");
        	
        }
        else {
        	bill=unit*3;
        	System.out.println("Your bill is = "+bill+" RS");
        	        	
        }
 
        sc.close();
			}
}

