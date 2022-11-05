package assignment_1;

public class Assignment1_Task2 {

	public static void main(String[] args) {
//		Task 2-  Write a program to print the sum of below 5 numbers.
//		10,90.78,111,8989,7876
		byte a = 10;
		double b = 90.78;
		byte c = 111;
		int d = 8989;
		int e = 7876;
		double sum = a + b + c + d + e;
		System.out.println("Sum of 5 numbers using normal approach is " + sum);

		// ===================================================//

		// Method-2 using objectArray
		double sum_ObjArray = 0;
		Object[] numbers = { 10, 90.78, 111, 8989, 7876 };
		for (Object num : numbers) {
			double numConverted = Double.parseDouble(num.toString());
			sum_ObjArray = sum_ObjArray + numConverted;
		}
		System.out.println("Sum of 5 numbers using objectarray is " + sum_ObjArray);

	}

}
