package projectWork;

import java.util.Scanner;

public class sumofDigitbyR {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int num, sum;
        System.out.print("Enter a number:\t");
        num=x.nextInt();
        sum = sumOfDigit(num);
        System.out.print("The sum of digits is : "+ sum);
    }

    static int sumOfDigit(int num)
    {
        int sum=0;int remainder =0;
        while(num != 0)
        {
            remainder = num%10;
            sum += remainder;
            num = num/10;
        }
    return sum;
    }

}
