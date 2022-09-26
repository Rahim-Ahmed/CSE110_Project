package projectWork;

import java.util.Scanner;

public class largeNumber {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);

        System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");
        int n,i;
        float c,big;

        System.out.print("\n\nEnter the number of elements you wish to find the greatest element of: ");
        n=x.nextInt();
        System.out.print("\n\nEnter numbers : "+ n);

        System.out.print("\n\n\t\t\tElement 1: ");

        //Important step- always initialize big to the first element
        big=x.nextFloat();

        for(i = 2; i <= n; i++)
        {
            System.out.print("\n\t\t\tElement "+ i+" : ");
            c=x.nextFloat();
        /*
            if input number is larger than the
            current largest number
        */
            if(big < c)
                big = c;    // update big to the larger value
        }

        System.out.print("\n\n\nThe largest of the numbers is "+ big);
        System.out.print("\n\n\n\n\t\t\tCoding is Fun !\n\n\n");
    }
}
