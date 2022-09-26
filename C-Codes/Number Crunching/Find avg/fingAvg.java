package projectWork;

import java.util.Scanner;

public class fingAvg {
    public static void main(String[] args) {

        Scanner p=new Scanner(System.in);
        System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");

        int n, i;
        float sum = 0, x;

        System.out.print("Enter number of elements:  ");
        n=p.nextInt();

        System.out.print("\n\n\nEnter elements "+ n);
        for(i = 0; i < n; i++)
        {
            x=p.nextInt();
            sum += x;
        }
        System.out.print("\n\n\nAverage of the entered numbers is = "+ (sum/n));
        System.out.print("\n\n\n\n\t\t\tCoding is Fun !\n\n\n");
    }
}
