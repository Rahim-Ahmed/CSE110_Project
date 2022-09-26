package projectWork;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");
        int a, b, lcm;
        System.out.print("\n\nEnter 2 integers to find LCM of:\n");
        a=x.nextInt();
        b=x.nextInt();
        lcm = find_lcm(a,b);    // function call
        System.out.print("\n\n LCM of is: "+ lcm);
        System.out.print("\n\n\t\t\tCoding is Fun !\n\n\n");
    }

    static int find_lcm(int a, int b)  // function definition
    {int lcm=0;
        lcm = (a > b) ? a : b;

        // Always true
        while(true) {
            if( lcm % a == 0 && lcm % b == 0 ) {

                break;
            }
            ++lcm;
        }
        return lcm;
    }
}
