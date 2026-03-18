import java.util.Scanner;

public class CheckThreeDigit {
    public static void main(String[] args) {
		
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        
        if((number>= 100 && number<= 999)||(number<=-100 && number>=-999)) {
        	System.out.println("Entered number is 3 digit number");
        }
        else {
        	System.out.println("Entered number is not 3 digit number");
        }
        
        sc.close();
			}
}
