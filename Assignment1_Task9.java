package assignment_1;

public class Assignment1_Task9 {

	public static void main(String[] args) {
		// Task-9-Write a program which will break the current execution if it find
		// number 85
		// Input – [12,34,66,85,900]

		System.out.println("Numbers before finding 85 are:");

		short[] numbersToFilter = { 12, 34, 66, 85, 900 };

		for (short counter = 0; counter < numbersToFilter.length; counter++) {

			if (numbersToFilter[counter] == 85) {
				break;
			} else {
				System.out.println(numbersToFilter[counter]);
			}

		}

		//********************************************************************//
		System.out.println("Numbers before finding 85 using switch case are:");

		short[] numbersToFilterSC = { 12, 34, 66, 85, 900 };

		for (short counter = 0; counter < numbersToFilterSC.length; counter++) {
			int forLoopBreakCounter = 0;
			switch (numbersToFilterSC[counter]) {
			case 85: {
				forLoopBreakCounter = 1;
				break;
			}
			default: {
				System.out.println(numbersToFilterSC[counter]);
			}
			}
			if (forLoopBreakCounter == 1) {
				break;
			}

		}

	}

}
