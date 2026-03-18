import java.util.Scanner;

public class Vovel_Consonent {
	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter character");
        int ch = sc.next().charAt(0);
        
        if((ch=='A'||ch=='a')||(ch=='E'||ch=='e')||(ch=='I'||ch=='i')||(ch=='O'||ch=='o')
        		||(ch=='U'||ch=='u')) {
        	System.out.println("Entered character is vovel");
        }
        else {
        	System.out.println("Entered character is consonent");
        }
        
        sc.close();
			}
}
