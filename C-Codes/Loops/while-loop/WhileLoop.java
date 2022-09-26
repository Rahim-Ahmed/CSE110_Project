package projectWork;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");

    /*
        always declare the variables before using them
    */
        int i = 0;  // declaration and initialization at the same time

        System.out.print("\nPrinting numbers using while loop from 0 to 9\n\n");

    /*
        while i is less than 10
    */
        while(i<10)
        {
            System.out.print(" "+i);

        /*
            Update i so the condition can be met eventually
            to terminate the loop
        */
            i++;    // same as i=i+1;
        }
        System.out.print("\n\n\t\t\tCoding is Fun !\n\n\n");
    }
}
