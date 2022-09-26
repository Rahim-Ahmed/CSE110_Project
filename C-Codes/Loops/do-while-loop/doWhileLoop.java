package projectWork;

public class doWhileLoop {
    public static void main(String[] args) {
        System.out.println("\n\n\t\tStudytonight - Best place to learn\n\n\n");

    /*
        always declare the variables before using them
    */
        int i = 10;     // declaration and initialization at the same time

        do // do contains the actual code and the updation
        {
            System.out.println("i = "+i);
            i = i-1;    // updation
        }
        // while loop doesn't contain any code but just the condition
        while(i > 0);

        System.out.println("\n\tThe value of i after exiting the loop is "+i);
        System.out.println("\n\n\t\t\tCoding is Fun !\n\n\n");
    }
}
