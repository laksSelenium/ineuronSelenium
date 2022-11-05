package assignment_2;
/*
 * Task 1- Create a class name as “Trainer” which will have 4 fields name,
 * department , email, id. Trainer can teach Selenium, DevOps, Web Development.
 * Note- use method, constructor
 * 
 * Trainer details are Trainer 1 – “Mukesh” ,”Testing”,mukesh@gmail.com, 1
 * Trainer 2 – “Hitesh” ,”Dev”,mukesh@gmail.com, 2 Trainer 1 – “Mukesh”
 * ,”DevOps”,mukesh@gmail.com, 3
 * 
 * Trainer 1 can teach Selenium, Trainer 2 can teach Web Development, Trainer 3
 * can teach DevOps.
 * 
 */

public class Trainer {
	String name;
	String department;
	String email;
	byte id;// It can be long depending upon the number of enteries. Now since 3 records,
			// made as byte)

	public Trainer(String trainerName, String trainerDepartment, String trainerEmail, byte trainerId) {
		name = trainerName;
		department = trainerDepartment;
		email = trainerEmail;
		id = trainerId;
		
		switch(trainerId) {
		case 1:{
			System.out.println("***************************");
			System.out.println("The details of the trainer are:");
			System.out.println("Name of the trainer is "+name);
			System.out.println("Department of the trainer is "+department);
			System.out.println("emailId of the trainer is "+email);
			System.out.println("Id of the trainer is "+id);
			System.out.println("This trainer teaches Selenium");
			break;
		}
		case 2:{
			System.out.println("***************************");
			System.out.println("The details of the trainer are:");
			System.out.println("Name of the trainer is "+name);
			System.out.println("Department of the trainer is "+department);
			System.out.println("emailId of the trainer is "+email);
			System.out.println("Id of the trainer is "+id);
			System.out.println("This trainer teaches Web Development");
			break;
		}
		case 3:{
			System.out.println("***************************");
			System.out.println("The details of the trainer are:");
			System.out.println("Name of the trainer is "+name);
			System.out.println("Department of the trainer is "+department);
			System.out.println("emailId of the trainer is "+email);
			System.out.println("Id of the trainer is "+id);
			System.out.println("This trainer teaches Devops");
			break;
		}
		default:{
			System.out.println("Enter the trainer Id properly");
			break;
		}
			
		}

	}

	public static void main(String[] args) {
		
		Trainer trainer1 = new Trainer("Mukesh","Testing","mukesh@gmail.com",(byte)1);
		Trainer trainer2 = new Trainer("Hitesh","Dev","mukesh@gmail.com",(byte)2);
		Trainer trainer3 = new Trainer("Mukesh","DevOps","mukesh@gmail.com",(byte)3);
		

	}

}
