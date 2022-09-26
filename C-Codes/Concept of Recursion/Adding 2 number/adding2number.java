package projectWork;

import java.util.Scanner;

public class adding2number {
    public static int add(int a,int b){
        int y;

            if(b == 0)
                return a;
            y = add(a, b -1) + 1;
            return y;   // return the result
        }

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
            System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");
            int a, b, r;
        System.out.print("Enter the two numbers:\n");
            a=x.nextInt();
            b=x.nextInt();
            r = add(a, b);     // function call
            System.out.print("\n\nSum of two numbers is: "+ r);

            System.out.print("\n\n\t\t\tCoding is Fun !\n\n\n");

    }
}
