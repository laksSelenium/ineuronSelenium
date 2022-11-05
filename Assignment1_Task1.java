package assignment_1;

public class Assignment1_Task1 {

	public static void main(String[] args) {
		//Task 1 – Write a program to swap two number. For example a=10 and b=20 output should be a=20 and b=10
		int a=10;
		int b=20;
		System.out.println("Value of a before swapping is "+a);
		System.out.println("Value of b before swapping is "+b);
		int c=a+b;
		b=c-b;
		a=c-b;		
		System.out.println("Value of a after swapping is "+a);
		System.out.println("Value of b after swapping is "+b);
		

	}

}
