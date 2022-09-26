package projectWork;

import java.util.Scanner;

public class ifElsee {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("\n\n\t\tStudytonight - Best place to learn\n\n\n");

        int number;
        System.out.println("Please enter a number:\n");
        number=x.nextInt();
    /*
        For single statements we can skip the curly brackets
    */
        if(number < 100)
            System.out.println("Number is less than 100!\n");
        else if(number == 100)
            System.out.println("Number is 100!\n");
        else
            System.out.println("Number is greater than 100!\n");

        System.out.println("\n\n\t\t\tCoding is Fun !\n\n\n");
    }
}
