package assignment_1;

public class Assignment1_Task6 {

	public static void main(String[] args) {
		// Task 5- Write a program to print all odd numbers from 1-50
		System.out.println("Odd numbers from 1-50 are:");
		
		for (int a = 2; a <= 50; a++) {
			int counter = 0;
			for (int b = 2; b < a; b++) {

				if ((a > 3) && (a % b == 0)) {
					counter = counter + 1;
					break;
				}

			}
			if (counter == 0) {
				System.out.println("Number " + a + " is a prime number");
			}
		}

	}

}
