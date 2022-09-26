package projectWork;

public class nestedForLoop {
    public static void main(String[] args) {
        System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");
        System.out.print("\n\nNested loops are usually used to print a pattern in c. \n\n");
        System.out.print("\n\nThey are also used to print out the matrix using a 2 dimensional array. \n\n");

        int i,j,k;
        System.out.print("\n\nOutput of the nested loop is :\n\n");
        for(i = 0; i < 5; i++)
        {
            System.out.print("\t\t\t\t");
            for(j = 0; j < 5; j++)
                System.out.print("* ");

            System.out.print("\n");
        }
        System.out.print("\n\n\t\t\tCoding is Fun !\n\n\n");
    }
}
