package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */


import java.util.Scanner;

/*
* Make sure to complete and submit your lab
*/


public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/

public static void twisters (){
    
      for (int i = 0 , j = 1 ; i <= 110 ; i++){
        if (j <= 4){
        if (i % 2 ==0)
        System.out.print("Tweetle");
        if (i % 4 ==0)
        System.out.print("Beetle");
        if (i % 6 ==0)
        System.out.println("Poodle");
        if (i%2 != 0 && i%4 != 0 && i %6 !=0)
        System.out.print(i + " ");

        j++;
        }
        else 
        System.out.println();
        continue;
    }
    
    System.out.println();

}

/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/

public static void phoneKeypad (String str){
    for (int i = 0 ; i < str.length() ; i++) {
        switch (str.charAt(i)){
            case 'a':
            case 'b': 
            case 'c':
        
            System.out.print(2);
              continue;

            case 'd' :
            case 'e' :
            case 'f':

            System.out.print(3);
               continue;
            case 'g' :
            case 'h' :
            case 'i' :

            System.out.print(4);
               continue;
            case 'j' :
            case 'k' :
            case 'l' :

            System.out.print(5);
               continue;
            case 'm' :
            case 'n' :
            case 'o' :
            System.out.print(6);
               continue;
            case 'p' :
            case 'q' :
            case 'r' :
            case 's' :

            System.out.print(7);
               continue;
            case 't' :
            case 'u' :
            case 'v' :

            System.out.print(8);
               continue;
            case 'w' :
            case 'x' :
            case 'y' :
            case 'z' :

            System.out.print(9);
               continue;

        }
        System.out.println();
        
    }
}
 
    public static void main(String [] args) {

        Scanner scnr = new Scanner (System.in);
        

        /* Write your code here */
     
       //call method twisters()
       //prompt user to enter a string 
       //call method phoneKeypad(string)

       twisters();

       System.out.println("Enter str");
       String userStr = scnr.nextLine();
       phoneKeypad(userStr);


      scnr.close();
    }

}
