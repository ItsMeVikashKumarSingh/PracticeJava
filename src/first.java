import java.util.*;
import java.lang.*;
public class first {

    public static void main(String args[])
    {
        int age ;
        String name;
        Scanner s = new Scanner(System.in);
        Scanner S2 = new Scanner(System.in);

        if (s.hasNextInt()) {
            age = s.nextInt();
            System.out.println(age);
        }
        else
            System.out.println("Enter integer only");

        if (S2.hasNext()) {
            name = S2.next();
            System.out.println(name);
        }
        else
            System.out.println("Enter String only");
    }
}
