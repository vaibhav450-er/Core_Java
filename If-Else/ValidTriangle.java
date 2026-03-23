public class ValidTriangle {

	public static void main(String[] args) {
	
		int a=3;
		int b=4;
		int c=5;
		if((a + b > c)&&(a + c > b)&&(b+c>a)) {
			System.out.println("Triangle is valid");
		}
		else {
			System.out.println("Triangle is not valid");
		}
			}
    
}
