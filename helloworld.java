import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("byeWorld");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println("You entered: " + num);
		in.close(); 
	}	
}
