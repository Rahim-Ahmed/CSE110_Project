package projectWork;

import java.util.Scanner;

public class leapYear implements leapYearIn{
    public void year(){
        Scanner x=new Scanner(System.in);

        System.out.println("\n\n\t\tStudytonight - Best place to learn\n\n\n");

        int year;

        System.out.println("Enter the year to check if it is a leap year: ");
        year=x.nextInt();

        // divisible by 4, 100 and 400
        if(year%400 == 0)
            System.out.println(year+" is a leap year\n");

            // divisible by 100 and 4 and not divisible by 400
        else if(year%100 == 0)
            System.out.println(year+" is not a leap year\n");

            // divisible only by 4 and not by 100
        else if(year%4 == 0)
        {
        /*
            %0nd is used to represent the number
            in n digits with leading 0's
        */
            System.out.println(year+" is a leap year\n");
        }
        // not divisible by 4
        else
            System.out.println(year+" is not a leap year\n");

        System.out.println("\n\n\t\t\tCoding is Fun !\n\n\n");

    }

    public static void main(String[] args) {
        leapYear x =new leapYear();
        x.year();
    }
}
