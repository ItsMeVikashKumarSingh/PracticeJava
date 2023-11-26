/**
 * throws Exception
 */
public class throw Exception {
static void divide(int a , int b) throws Exception
{
    try{
    System.out.println(a/b);
    }
    catch(Exception e){
    {
        System.out.println("Invalid Input "+e);
    }
}
    
}

public class throwssss{
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
