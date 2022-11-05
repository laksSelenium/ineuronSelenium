package assignment_1;

public class Assignment1_Task8 {

	public static void main(String[] args) {
		// Task 8- Write a program to print below students marks who have scored above
		// 80
		// Example- 78,12,89,55,35
		// Output- 89
		System.out.println("Marks scored above 80 are :");
		byte[] marks = { 78, 12, 89, 55, 35 };
		for (byte counter = 0; counter < marks.length; counter++) {
			if (marks[counter] > 80) {
				System.out.println(marks[counter]);
			}
		}

	}
}