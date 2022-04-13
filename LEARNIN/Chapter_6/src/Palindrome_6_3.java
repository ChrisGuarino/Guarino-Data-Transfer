import javax.swing.*;
import java.util.Scanner;

public class Palindrome_6_3 {
    public static void main(String[] args){
        //Program needs to read an input integer and determine if it is a palindrome.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer.");
        int number = input.nextInt();
        //Call reverse method.
        int reversed = reverse(number);
        System.out.println("The reverse of the entered integer is " + reversed + ".");
        isPalindrome(number);
        //Alternative to isPalindrome method.
//        if (number == reversed){
//            System.out.println(number + " is a palindrome.");
//            }else{
//            System.out.println(number + " is not a palindrome.");
//        }
    }
    //Make a method that can take input and reverse it's index order.
    public static int reverse(int number){
        //Translate input to local variable.
        int reversed = 0;
        while(number != 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
    //Make a method that compares the input number to it's reversed counterpart.
    public static boolean isPalindrome(int number) {
       if  (number == reverse(number)){
           System.out.println(number + " is a palindrome.");
       }else{
           System.out.println(number + " is NOT a palindrome.");
       } return true;
      }
    }
