import java.util.Scanner;
public class Credentials {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter username");
		String u=sc.next();
		System.out.println("Enter password");
		String p=sc.next();
		String username="vaibhav";
		String password="keni@123";
		if(u.equals(username)&& p.equals(password)) {
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Login Failed");
		}
        sc.close();
}

}
