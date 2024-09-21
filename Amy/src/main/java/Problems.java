import java.util.Scanner;

public class Problems {
  public static void main(String[] args) {
    /*1. 
    Write a program that prints all the numbers from 1 to 100. For multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz". For numbers that are multiples of both 3 and 5, print "FizzBuzz".

2. Create a program that asks the user to input a number and prints whether the number is even or odd. Then, if the number is odd print the next multiple of 10. For example, if the number is 63 print 70.

    */
    
    int ab = 0;
      for(ab = 0; ab<=100; ab++){
      System.out.println(ab);

        if(ab%3 == 0){
          System.out.println("Fizz");
          }

        if(ab%5 == 0){
          System.out.println("Buzz");

        }
        if(ab%15 == 0){
          System.out.println("FizzBuzz");
        }
      }

  
  }
    }



