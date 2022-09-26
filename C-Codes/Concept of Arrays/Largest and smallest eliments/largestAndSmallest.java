package projectWork;

import java.util.Scanner;

public class largestAndSmallest {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");
        int []a=new int[50];
        int size, i, big, small;

        System.out.print("\nEnter the size of the array: ");
        size=x.nextInt();

        System.out.print("\n\nEnter the "+ size+" elements of the array: " );
        for(i = 0; i < size; i++)
            a[i]=x.nextInt();

        big = a[0]; // initializing
    /*
        from 2nd element to the last element
        find the bigger element than big and
        update the value of big
    */
        for(i = 1; i < size; i++)
        {
            if(big < a[i])   // if larger value is encountered
            {
                big = a[i]; // update the value of big
            }
        }
        System.out.print("\n\nThe largest element is: "+ big);

        small = a[0];   // initializing
    /*
        from 2nd element to the last element
        find the smaller element than small and
        update the value of small
    */
        for(i = 1; i < size; i++)
        {
            if(small>a[i])   // if smaller value is encountered
            {
                small = a[i];   // update the value of small
            }
        }
        System.out.print("\n\nThe smallest element is: "+ small);
        System.out.print("\n\n\t\t\tCoding is Fun !\n\n\n");
    }
}
