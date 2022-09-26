package projectWork;

import java.util.Scanner;

public class lagestfrom3Number {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("\n\n\t\tStudytonight - Best place to learn\n\n\n");
        double a, b, c;

        System.out.println("Enter 3 numbers:\n\n");
        a=x.nextDouble();
        b=x.nextDouble();
        c=x.nextDouble();
        if(a >= b && a >= c)
        {
        /*
            %.3f prints the floating number
            upto 3 decimal places
        */
            System.out.println("\n\nLargest number = "+ a);
        }
        else if(b >= a && b >= c)
        {
            System.out.println("\n\nLargest number is = "+ b);
        }
        else
        {
            System.out.println("\n\nLargest number is = "+ c);
        }

        System.out.println("\n\n\t\t\tCoding is Fun !\n\n\n");

    }
}
