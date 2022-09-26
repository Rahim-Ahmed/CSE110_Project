package projectWork;

public class OddEven {
    public static void main(String[] args) {
        System.out.print("\n\n\t\tStudytonight - Best place to learn\n\n\n");
        int x;
        for(x = 0; x <= 10; x++)
        {
            if(x%2==0) // if number is odd
                System.out.print("\t\t\tNumber is even "+x);
            else  // ! is used inside if to reverse the boolean value
                System.out.print("\t\t\tNumber is odd "+x);
        }

        System.out.print("\n\n\n\n\t\t\tCoding is Fun !\n\n\n");
    }
}
