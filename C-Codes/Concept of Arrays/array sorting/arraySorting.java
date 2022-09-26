package projectWork;

import java.util.Arrays;
import java.util.Scanner;

public class arraySorting {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);

        int i, c, n;

        System.out.print("Enter number of elements you want to sort: ");
        n=x.nextInt();
        int []a=new int[n];
        for(i = 0; i < n; i++)
            a[i]=x.nextInt();

        Arrays.sort(a);

        for(i = 0; i <n; i++)
            System.out.print(" "+a[i]);


    }

}
