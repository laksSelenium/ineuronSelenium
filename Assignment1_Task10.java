package assignment_1;

public class Assignment1_Task10 {

	public static void main(String[] args) {
		// Task 10- Write a program which will break the current execution if it find
		// “Selenium”
		// Input – [“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”]

		System.out.println("String before finding Selenium using forEach are:");
		
		String[] textToFilter = { "Java", "JavaScript", "Selenium", "Python", "Mukesh" };
		for (String stringToVerify : textToFilter) {
			if (stringToVerify.equalsIgnoreCase("Selenium")) {
				break;
			} else {
				System.out.println(stringToVerify);
			}
		}
		
		//********************************************************************//

		System.out.println("String before finding Selenium using forLoop are:");

		for (short counter = 0; counter < textToFilter.length; counter++) {

			if (textToFilter[counter].equalsIgnoreCase("Selenium")) {
				break;
			} else {
				System.out.println(textToFilter[counter]);
			}

		}

		//********************************************************************//
		System.out.println("String before finding Selenium using switch case are:");

		String[] textToFilterSC = { "Java", "JavaScript", "Selenium", "Python", "Mukesh" };

		for (short counter = 0; counter < textToFilterSC.length; counter++) {
			int forLoopBreakCounter = 0;
			switch (textToFilterSC[counter]) {
			case "Selenium": {
				forLoopBreakCounter = 1;
				break;
			}
			default: {
				System.out.println(textToFilterSC[counter]);
			}
			}
			if (forLoopBreakCounter == 1) {
				break;
			}

		}

	}

}
