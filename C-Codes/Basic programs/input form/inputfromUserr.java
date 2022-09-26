package projectWork;

import java.util.Scanner;

public class inputfromUserr {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);

        System.out.println("\n\n\t\tStudytonight - Best place to learn\n\n\n");

        int num1, num2;
        float fraction;
        String character;

        System.out.println("Enter two numbers number\n");

        // Taking integer as input from user
        num1=x.nextInt();
        num2=x.nextInt();
        System.out.println("\n\nThe two numbers You have entered are "+ num1+" and "+ num2);

        // Taking float or fraction as input from the user
        System.out.println("\n\nEnter a Decimal number\n");
        fraction=x.nextFloat();
        System.out.println("\n\nThe float or fraction that you have entered is "+ fraction);

        // Taking Character as input from the user
        System.out.println("\n\nEnter a Character\n");
        x.nextLine();
        character=x.nextLine();
        System.out.println("\n\nThe character that you have entered is "+ character);

        System.out.println("\n\n\t\t\tCoding is Fun !\n\n\n");
    }
}
