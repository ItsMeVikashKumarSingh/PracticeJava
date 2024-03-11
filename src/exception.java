public class exception Exception {
    static void divide(Integer a, Integer b)
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
    public static void main(String[] args)
    {
        divide(5,0);
    }
}
