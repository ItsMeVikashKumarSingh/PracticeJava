class rectangle
{
    int x=10,y=10,z=10;
    rectangle(int x , int y){
        System.out.println(x*y);
    }
}

class cuboid extends rectangle
{
    int z=10;
    cuboid(int x , int y , int z)
    {
        super(x,y);
        System.out.println(z);
        System.out.println(x*y*z);
        System.out.println(super.x*super.y);
        System.out.println(super.x*super.y*super.z);
        System.out.println(super.x*super.y*z);
        System.out.println(super.x*y*z);
        System.out.println(x*y*z);
        System.out.println(x*y*super.z);
        System.out.println(x*super.y*z);
        System.out.println(x*y*super.z);
        System.out.println(x*super.y*super.z);
    }
}
public class superclass
{
        public static void main(String[] args)
    {
        //System.out.println("HHKJL");
        cuboid c = new cuboid(2,3,4);
    }
}