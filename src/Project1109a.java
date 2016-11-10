import java.util.Scanner;

public class Project1109a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<10; i++)
			System.out.println("Hello World " + i + " !");
		
	    Scanner keyboard = new Scanner(System.in);

	    int num1, num2, num3;

	    System.out.print( "First temperature? " );
	    num1 = keyboard.nextInt();

	    System.out.print( "Second temperature? " );
	    num2 = keyboard.nextInt();

	    System.out.println("The max value is : " + Math.max(num1, num2));
	}

}
