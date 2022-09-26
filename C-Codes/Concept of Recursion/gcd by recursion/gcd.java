package projectWork;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");
        int a, b, gcd;
        System.out.print("\n\nEnter two numbers to find GCD of \n");
        a=x.nextInt();
        b=x.nextInt();
        gcd = find_gcd(a, b);
        System.out.print("\n\nGCD of is: "+ gcd);
        System.out.print("\n\n\t\t\tCoding is Fun !\n\n\n");
    }

    // defining the function
   public static int find_gcd(int x, int y)
    {int gcd=0;
        for (int i = 1; i <= x && i <= y; ++i) {

            // check if i perfectly divides both n1 and n2
            if (x % i == 0 && y % i == 0)
                gcd = i;
        }
        return gcd;
    }
}
