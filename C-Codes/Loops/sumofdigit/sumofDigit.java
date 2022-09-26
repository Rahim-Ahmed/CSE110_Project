package projectWork;

import java.util.Scanner;

public class sumofDigit {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");

        int n, sum = 0, c, remainder;

        System.out.print("Enter the number you want to add digits of:  ");
        n=x.nextInt();

        while(n != 0)
        {
            remainder = n%10;
            sum += remainder;
            n = n/10;
        }

        System.out.print("\n\nSum of the digits of the entered number is  = "+sum);
        System.out.print("\n\n\n\n\t\t\tCoding is Fun !\n\n\n");
    }
}
