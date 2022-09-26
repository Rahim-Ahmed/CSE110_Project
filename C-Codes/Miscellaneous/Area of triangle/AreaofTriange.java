package projectWork;

import java.util.Scanner;

public class AreaofTriange{
    public static void main(String[] args) {
       Scanner x=new Scanner(System.in);
        System.out.println("\n\n\t\tStudytonight - Best place to learn\n\n\n");
        float h, b;
        float area;
        System.out.println("\n\nEnter the height of the Triangle: ");
        h=x.nextInt();
        System.out.println("\n\nEnter the base of the Triangle: ");
        b=x.nextInt();

        tri1 s = new tri1();
        tri2 s1 = new tri2(h,b);
    /*
        Formula for the area of the triangle = (height x base)/2

        Also, typecasting denominator from int to float
        to get the output in float
    */
        System.out.println("\n\n\nThe area of the triangle is: "+ s1.area());

        System.out.println ("\n\n\t\t\tCoding is Fun !\n\n\n");
    }
}
