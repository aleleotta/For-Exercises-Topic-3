package exercises;

public class Exercise3 {
	public static void main(String[] args) {
		int i; //Multiplicand
		int m = 1; //Multiplier
		int r = 7; //Result, the multiple.
		System.out.println("Finding multiples of 7 less than 100..."); //Program message
		for(i = 7; r < 98; m++) { //i stays the same, the multiplier increments by 1, and the result must not be greater than 100.
			r = i * m; //Operation
			System.out.println(r); //Print
		}
	}
}