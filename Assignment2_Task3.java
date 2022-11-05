package assignment_2;

import java.util.Scanner;

/*
 * Task 3 – Create a program which will store students information and print the output.
Program should ask how many students information you want to store. For each students it should ask name, email, phone, address, status
Once all entries are done, program should ask which user information you want to fetch and should print the same.
Note- Use scanner class for dynamic students

 */

public class Assignment2_Task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of students information you want to store ");
		byte totalNumberOfStudents = sc.nextByte();

		Object[][] studentDetails = new Object[totalNumberOfStudents][2];
		System.out.println();
	
			for (int rowCounter = 0; rowCounter < studentDetails.length; rowCounter++) {

				for (int columnCounter = 0; columnCounter <= 1; columnCounter++) {
					if (columnCounter == 0) {
						System.out.println("Please enter the email");
						studentDetails[rowCounter][columnCounter] = sc.next();
					}
					columnCounter = 1;
					System.out.println("Please enter the name");
					studentDetails[rowCounter][columnCounter] = sc.next();

				}

			}
	
		System.out.println("Please enter which students information is required");
		int snOfStudent = sc.nextInt();

		System.out.println(studentDetails[(snOfStudent - 1)][0]);
		System.out.println(studentDetails[(snOfStudent - 1)][1]);
		sc.close();

	}

}
