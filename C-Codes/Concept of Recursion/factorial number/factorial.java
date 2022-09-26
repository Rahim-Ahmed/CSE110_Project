package projectWork;

import java.util.Scanner;

public class factorial extends factAbs {
    @Override
    public void Fact() {
        Scanner x = new Scanner(System.in);
        Factorial f=new Factorial();
        System.out.print("Enter a number");
        int n=x.nextInt();
        int result =f.fact(n);
        System.out.println("Factorial of "+n+" is : "+result);

    }

    public static class Factorial{
        int fact(int n){
            if(n==1)
                return 1;
            else return n*fact(n-1);

        }
    }

    public static void main(String[] args) {
        factorial x=new factorial();
        x.Fact();
    }
}
