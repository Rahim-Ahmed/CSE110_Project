package projectWork;

public class forLoop {
    public static void main(String[] args) {
        System.out.println("\n\n\t\tStudytonight - Best place to learn\n\n\n");

    /*
        Always declare the variables before using them
    */
        int i = 0;  // declaration and initialization at the same time


        for(i = 0; i < 10; i++)
        {
            System.out.println("i = "+ i);

        /*
            consequently, when i equals 10, the loop breaks.
            i is updated before the condition is checked-
            hence the value of i after exiting the loop is 10
        */
        }

        System.out.println("\n\tThe value of i after exiting the loop is "+ i);

        System.out.println("\nRemember that the loop condition checks the conditional statement before it loops again.\n\n");

        System.out.println("Consequently, when i equals 10, the loop breaks.\n\n");

        System.out.println("i is updated before the condition is checked- hence the value of i after exiting the loop is 10 .\n\n");

        System.out.println("\n\n\t\t\tCoding is Fun !\n\n\n");
    }
}
