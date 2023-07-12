package tpquatre;
import java.util.Scanner;

public class tp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Write a mother fucking number");
		
		int test = input.nextInt();
		
		String binary = Integer.toBinaryString(test);
		String octal = Integer.toOctalString(test);
		String hex = Integer.toHexString(test);
		System.out.println("This is the mf binary: " + binary);
		System.out.println("This is the mf octal: " + octal);
		System.out.println("This is the mf hex: " + hex);
		
	}

}
