package projectWork;

import java.util.Scanner;

public class sumOfN {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");
        int n, sum = 0, c;
        int []array=new int[100];

        System.out.print("Enter the number of integers you want to add: ");
        n=x.nextInt();

        System.out.print("\n\nEnter "+n+ " integers \n\n" );

        for(c = 0; c < n; c++)
        {
             array[c]=x.nextInt();
            sum += array[c];    // same as sum = sum + array[c]
        }

        System.out.print("\n\nSum = "+ sum);
        System.out.print("\n\n\t\t\tCoding is Fun !\n\n\n");
    }
}
