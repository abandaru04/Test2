/*
Name: Akhilesh Bandaru
Date: Friday January 17th 2023
Assignment: 2
Question: 2
Decription: calculates and prints prime numbers less than 10,000 (using the switch and
for statements)
 */
package assignment2q2;

/**
 *
 * @author akhil
 */
public class Assignment2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variable declaration 
        int i =0;
        int num =0;
       
       String  prime_numbers = "";
        // looping the numbers until 10000
       for (i = 1; i <= 10000; i++)         
       { 	
           
          int counter=0; 
          // checks if number is prime
          for(num =i; num>=1; num--)
    	  {
             switch(i%num)
    	     {
                 case 0:
                     counter = counter + 1;
                     break;
    	     }
    	  }
                   
    	  switch(counter)
    	  {
                        case 2:
                            prime_numbers = prime_numbers + i + " ";
                            break;
    	  }	
       }	
        // prints the prime numbers
       System.out.println(prime_numbers);
        
  }
}
  
