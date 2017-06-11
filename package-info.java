//Write a program in java to compare the truth table of Bitwise AND and Logical AND.
//Hint: - Take two-byte variables and take the input from the user(as 0 0, 0 1, 1 0, 1 1) and show the result
//for Bitwise AND and Logical AND. 


package question_1_3;

import java.util.Scanner;

class Truth_Table_Comparison_Using_Bitwise_and_Logical_AND {

   public static void main(String args[])
   {
      int a;
      int b;
      	 
      Scanner in = new Scanner(System.in);
      

      System.out.println("Enter an integer");
      a = in.nextInt();
      System.out.println("You entered integer "+a);
      
    class LogicalOperatorBasics
    {
  	
      
   
    	//bitwise AND
    }
System.out.println(0&0);        //0

System.out.println(0&1);        //0

System.out.println(1&0);        //0

System.out.println(1&1);        //1
 

//Logical AND
	 System.out.println(true  && true);	// true
 
	 System.out.println(true  && false);   // false
 
         System.out.println(false && true);     //false
 
	 System.out.println(false && false);    // false
 
   }
}

         

