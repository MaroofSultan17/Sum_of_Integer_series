import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //take num to store the series and sum is store the sum of digits
        int num, sum=0;
        //parsing .....
        Scanner input = new Scanner(System.in);

        //print the message and take the series of integers
        System.out.print("Please enter the series of Integer : ");
        num = input.nextInt();

        //calsulate the sum of the digits
        while (num!=0)
        {
            int rem = num%10;
            sum+=rem;
            num = num/10;
        }

        //show the sum of digits
        System.out.println("Sum of the digits is : " + sum);
    }
}