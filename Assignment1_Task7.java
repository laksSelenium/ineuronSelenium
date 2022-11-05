package assignment_1;

public class Assignment1_Task7 {

	public static void main(String[] args) {
		// Task 7- Write a program to print below pattern
		/*
		*
		**
		***
		****
		*****
		******
		**/

		for (short a = 1; a <= 6; a++) {

			for (short b = 1; b <= a; b++) {
				System.out.print("*");
			}

			System.out.println("");

		}

	}

}
