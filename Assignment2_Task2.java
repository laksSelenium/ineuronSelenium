package assignment_2;
//Task 2- Extension of task 1 – Store all trainer information in Array.

public class Assignment2_Task2 {

	public static void main(String[] args) {

		Object[][] trainerDetails = new Object[3][4];
		trainerDetails[0][0] = "Mukesh";
		trainerDetails[0][1] = "Testing";
		trainerDetails[0][2] = "mukesh@gmail.com";
		trainerDetails[0][3] = 1;

		trainerDetails[1][0] = "Hitesh";
		trainerDetails[1][1] = "Dev";
		trainerDetails[1][2] = "mukesh@gmail.com";
		trainerDetails[1][3] = 2;

		trainerDetails[2][0] = "Mukesh";
		trainerDetails[2][1] = "DevOps";
		trainerDetails[2][2] = "mukesh@gmail.com";
		trainerDetails[2][3] = 3;
		System.out.println("Creating of array by setting size for rows and columns:");
		System.out.println("***************************");
		System.out.println("The details about trainer 1 is");
		System.out.println("Name of the trainer is " + trainerDetails[0][0]);
		System.out.println("Department of the trainer is " + trainerDetails[0][1]);
		System.out.println("emailId of the trainer is " + trainerDetails[0][2]);
		System.out.println("Id of the trainer is " + trainerDetails[0][3]);
		System.out.println("This trainer teaches Selenium");

		System.out.println("***************************");
		System.out.println("The details about trainer 2 is");
		System.out.println("Name of the trainer is " + trainerDetails[1][0]);
		System.out.println("Department of the trainer is " + trainerDetails[1][1]);
		System.out.println("emailId of the trainer is " + trainerDetails[1][2]);
		System.out.println("Id of the trainer is " + trainerDetails[1][3]);
		System.out.println("This trainer teaches Web Development");

		System.out.println("***************************");
		System.out.println("The details about trainer 3 is");
		System.out.println("Name of the trainer is " + trainerDetails[2][0]);
		System.out.println("Department of the trainer is " + trainerDetails[2][1]);
		System.out.println("emailId of the trainer is " + trainerDetails[2][2]);
		System.out.println("Id of the trainer is " + trainerDetails[2][3]);
		System.out.println("This trainer teaches DevOps");

		// ******************************************************************
		System.out.println("******************************************************************");

		System.out.println("Creating of array by directly assigning values");
		System.out.println("***************************");

		Object[][] trainerDetailsDirect = { { "Mukesh", "Testing", "mukesh@gmail.com", 1 },
				{ "Hitesh", "Dev", "mukesh@gmail.com", 2 }, { "Mukesh", "DevOps", "mukesh@gmail.com", 3 } };

		System.out.println("The details about trainer 1 is");
		System.out.println("Name of the trainer is " + trainerDetailsDirect[0][0]);
		System.out.println("Department of the trainer is " + trainerDetailsDirect[0][1]);
		System.out.println("emailId of the trainer is " + trainerDetailsDirect[0][2]);
		System.out.println("Id of the trainer is " + trainerDetailsDirect[0][3]);
		System.out.println("This trainer teaches Selenium");

		System.out.println("***************************");
		System.out.println("The details about trainer 2 is");
		System.out.println("Name of the trainer is " + trainerDetailsDirect[1][0]);
		System.out.println("Department of the trainer is " + trainerDetailsDirect[1][1]);
		System.out.println("emailId of the trainer is " + trainerDetailsDirect[1][2]);
		System.out.println("Id of the trainer is " + trainerDetailsDirect[1][3]);
		System.out.println("This trainer teaches Web Development");

		System.out.println("***************************");
		System.out.println("The details about trainer 3 is");
		System.out.println("Name of the trainer is " + trainerDetailsDirect[2][0]);
		System.out.println("Department of the trainer is " + trainerDetailsDirect[2][1]);
		System.out.println("emailId of the trainer is " + trainerDetailsDirect[2][2]);
		System.out.println("Id of the trainer is " + trainerDetailsDirect[2][3]);
		System.out.println("This trainer teaches DevOps");
	}

}
