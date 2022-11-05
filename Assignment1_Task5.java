package assignment_1;

public class Assignment1_Task5 {

	public static void main(String[] args) {
		//Task 6- Write a program to print all prime numbers from 1-1000
		System.out.println("Prime numbers between 1 to 1000 are:");

		for (int a = 2; a <= 1000; a++) {
			
			for(int b=2;b<=a;b++) {
				if (((byte) a % b == 0)&&(a>=3)&&(a!=b)) {
					System.out.println(a);
				}
				
			}
			

			

		}

	}

}
