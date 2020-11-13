
import java.util.Scanner;
/**
 *
 * author: Riley Trigo
 * This program is for error checking.  Find the errors and fix them!
 * When you have a working project with the following output:
 *      The average of 8, 6 and 2 is 6.0
 *	The sum of the two numbers is 12
 * 	The value of key is 1.5
 *      1000 / 10 equals 100.0
 * then upload the .java file to Schoology
 * *****Remember to change the name of the author
 * Remember to change the comment to the type of error
 * Remember to comment how your fixed the error or what the error was
 */


public class Errors {
 
    public static void main(String[] args) {
       //Calculate the average of three numbers and output with a label
 	System.out.println("The average of 8, 6 and 2 is: ");
	int TheTotal = 8 +6 + 2;
	int average = "TheTotal" / 3;
 	 System.out.println(average);

//The error in this section was a  type of error (syntax, logic or run-time)  // I fixed the error by...

	//Calculate the sum plus another number
	int sum = 8;
	int num = 4;
	int TheSum = sum - num;

	System.out.print("The sum of the two numbers is: ");
	System.out.println(TheSum);
/*
The error in this section was a Syntax type of error (syntax, logic or run-time)
 I fixed the error by adding ';'
The error in this section was a ______ type of error (syntax, logic or run-time)
 I fixed the error by...
Calculate key divided by lo and output with a label
*/


		int key = 6;
        int lo = 4;
        key = key / lo;
        System.out.println("The value of key is  ");
	System.out.println(key);
                
//The error in this section was a syntax type of error (syntax, logic or run-time)
// I fixed the error by fixing the typos

//The error in this section was a ______ type of error (syntax, logic or run-time) 
// I fixed the error by... 

//The error in this section was a ______ type of error (syntax, logic or run-time) 
// I fixed the error by... 

       //Calculate 100 divided by 10 and output with a label
       	double m = 100;
	int n = 10;
	double o = m/n;
        System.out.print("100 / 10 = ");
	System.out.println(o);
       
//The error in this section was a logic type of error (syntax, logic or run-time)
// I fixed the error by putting an equal sign

//The error in this section was a ______ type of error (syntax, logic or run-time) 
// I fixed the error by...        
       
       
    }
    
}
