public class literalsPractice {
    public static void main(String[] args)
    {
        int a=10;
        long b=10L;

        //int c = 99999999999999;   Error
        long d = 99999999999999L;
        int e = 999_999_999;

        int f=-10, g=10;
        System.out.println(Integer.toBinaryString(f));
        System.out.println(Integer.toBinaryString(g));
    }
}
