//Evan White
import java.util.Scanner;

public class ReviewIfStatements {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		//open and closing curly braces
		//indentations and whitespace
		//if ... else if ... else if ... else
		
		System.out.print("\nInput a grade: ");
		double grade = kb.nextDouble();   kb.nextLine();
		char letterGrade = 'F';
		
		//version 1
		//surround the if block with open and closing curly braces
		//many lines of code can make up the block of code
		if(grade >= 89.5)
		{
			letterGrade = 'A';
		}
		if(grade >= 79.5 && grade < 89.5)  //logical expression must be inside the ( )
		{
			letterGrade = 'B';
			//return;     //powerful key word
			            //leaves the method where this is located!!!
			            //comment out the return statement to continue with this program
		}
		if(grade >= 69.5 && grade < 79.5)
		{
			letterGrade = 'C';
		}

		System.out.println("version 1 ==> Grade : " + grade + " ===>> " + letterGrade);
		
		kb.nextLine();   //pause
		
		//version 2   
		//if there is only one line of code in the if block
		//the curly braces are optional
		if(grade >= 89.5)
		    letterGrade = 'A';
			
		if(grade >= 79.5 && grade < 89.5)
			letterGrade = 'B';
		
		if(grade >= 69.5 && grade < 79.5)
			letterGrade = 'C';

		System.out.println("version 2 ==> Grade : " + grade + " ===>> " + letterGrade);
		
		kb.nextLine();   //pause
		
		//version 3   
		//indentations are useful for debugging purposes 
		//indentations make it easier for us to read code
		//the compiler does not care about indentations or whitespace!
		
		if(grade >= 89.5)  letterGrade = 'A';
		if(grade >= 79.5 && grade < 89.5)  letterGrade = 'B';
		if(grade >= 69.5 && grade < 79.5)  letterGrade = 'C';

		System.out.println("version 3 ==> Grade : " + grade + " ===>> " + letterGrade);

		
		kb.nextLine();   //pause
		
		//version 4   
		//using if...else if ..else if ... else
		//more efficient -- but not an issue in this class
		
		if(grade >= 89.5)  
			letterGrade = 'A';
		else if(grade >= 79.5)  
			letterGrade = 'B';
		else if(grade >= 69.5)  
			letterGrade = 'C';
		else 
			letterGrade = 'F';

		System.out.println("version 4 ==> Grade : " + grade + " ===>> " + letterGrade);
	}

}

/*
Input a grade: 79.5
version 1 ==> Grade : 79.5 ===>> B

version 2 ==> Grade : 79.5 ===>> B

version 3 ==> Grade : 79.5 ===>> B

version 4 ==> Grade : 79.5 ===>> B
*/

