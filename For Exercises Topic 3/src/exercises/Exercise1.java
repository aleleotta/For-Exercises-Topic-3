package exercises;
import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		int n; //Count limit
		int i; //Increment
		Scanner sc = new Scanner(System.in); //Scanner declared.
		System.out.println("Introduce any number: "); //Program message to the user
		n = sc.nextInt(); //User introduces limit.
		for(i = 1; i <= n; i++) { //1º Initialization, 2º Condition, 3º Increment
			System.out.println(i); //Iteration print
		}
		System.out.println("Have a nice day!");
		sc.close(); //Scanner closed.
	}
}