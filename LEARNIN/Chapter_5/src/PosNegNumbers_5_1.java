import java.util.Scanner;
public class PosNegNumbers_5_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Prompt user for a series of integers.
        System.out.println("Enter an integer, the input ends if it is 0: ");
        //Define objects.
        int number = 3; // declared here because the while needs to check it
        int sum = 0;
        int count = -1;
        int positive = 0;
        int negative = 0;
        //Logic Loops
        while(number != 0)
        {
            number = input.nextInt();
            if(number > 0){
                positive++;
            }
            else if (number < 0){
                negative++;
            }
            sum += number;
            count++;
        }
//        System.out.printf("The total is %5.1f." , sum);
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        System.out.println("Number of positive: " + positive);
        System.out.println("Number of negative: " + negative);
    }
}