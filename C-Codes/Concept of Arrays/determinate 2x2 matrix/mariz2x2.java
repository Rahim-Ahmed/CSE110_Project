package projectWork;

import java.util.Scanner;

public class mariz2x2 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);

        System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");

        int [][]a=new int[2][2];int i, j;
        long determinant;

        System.out.print("\n\nEnter the 4 elements of the array\n");
        for(i = 0; i < 2; i++)
            for(j = 0; j < 2; j++)
                a[i][j]=x.nextInt();

        System.out.print("\n\nThe entered matrix is: \n\n");
        for(i = 0; i < 2; i++)
        {
            for(j = 0; j < 2; j++)
            {
                System.out.print("\t "+ a[i][j]);   // to print the complete row
            }
            System.out.print("\n"); // to move to the next row
        }

        // finding the determinant of a 2x2 matrix
        determinant = a[0][0]*a[1][1] - a[1][0]*a[0][1];
        System.out.print("\n\nDterminant of 2x2 matrix is : "+ a[0][0]*a[1][1]+" - " +a[1][0]*a[0][1]+" = "+ determinant);

        System.out.print("\n\n\t\t\tCoding is Fun !\n\n\n");
    }
}
