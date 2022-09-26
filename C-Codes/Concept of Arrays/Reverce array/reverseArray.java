package projectWork;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        try {
            Scanner x = new Scanner(System.in);
            System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");

            int c, d, n;
            int[] a = new int[100];
            int[] b = new int[100];
            System.out.print("\n\nEnter number of elements in array :");
            n = x.nextInt();
            System.out.print("\n\nEnter " + n + " elements");

            for (c = 0; c < n; c++)
                a[c] = x.nextInt();

    /*
        temporarily storing elements into array b
        starting from end of array a
    */
            for (c = n - 1, d = 0; c >= 0; c--, d++)
                b[d] = a[c];

    /*
        copying reversed array into original.
        Here we are modifying original array to reverse it.
    */

            for (c = 0; c < n; c++)
                a[c] = b[c];

            System.out.print("\n\n Resultant array is: ");
            for (c = 0; c < n; c++)
                System.out.print(a[c]);

            System.out.print("\n\n\t\t\tCoding is Fun !\n\n\n");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}