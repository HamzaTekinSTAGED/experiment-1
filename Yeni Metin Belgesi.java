import java.util.Scanner;
public class whileexample {

	public static void main(String[] args) {
        
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the lower bound:");
		int lower = scanner.nextInt();
		
		
		System.out.println("enter the upper bound:");
		int upper = scanner.nextInt();
		
		while(upper<=lower) {
			System.out.println ("upper must be bigger than lower, try again");
			System.out.println("enter the lower bound:");
			lower = scanner.nextInt();
			
			
			System.out.println("enter the upper bound:");
			upper = scanner.nextInt();
			
		}
		
		System.out.println("the even number between " + lower+ " and " + upper +" are");

		int i= lower ;
		while(i<upper) {

		if(i %2==0) {
			System.out.println(i);
		}
		i++;
		
		}
	}

}