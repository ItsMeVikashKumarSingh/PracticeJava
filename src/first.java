import java.util.*;
import java.lang.*;
public class first {
    public static void main(String[] args)
    {
        int age = 0;
        String name = null;
        Scanner s = new Scanner(System.in);
        Scanner S2 = new Scanner(System.in);

        if (s.hasNextInt()) {
            age = s.nextInt();
        }
        else
            System.out.println("Enter integer only");

        if (S2.hasNext()) {
            name = S2.next();
        }
        else
            System.out.println("Enter String only");
        
        System.out.println("Name : "+name);
        System.out.println("Age :"+age);
    }
}
