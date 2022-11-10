package exercises;

public class Exercise2 {
	public static void main(String[] args) {
		int i; //Increment
		System.out.println("Printing even numbers from 0 to 200..."); //Message to user
		for(i = 0; i <= 200; i = i + 2) { //1º Initialization, 2º Condition, 3º Increment
			System.out.println(i); //Iteration print
		}
		System.out.println("Have a nice day!");
	}
}