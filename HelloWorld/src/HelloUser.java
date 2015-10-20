import java.util.Scanner;


public class HelloUser {
		
	public HelloUser() {
		
	}
	
	
	public void greetUser(){
		System.out.println("Please enter your name: ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello " + scan.nextLine() + "!");
	}
	

}
