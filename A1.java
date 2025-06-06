package WrapperClass ;
public class A1
{
    public static void main(String[] args) {
        int a=10;
        System.out.println("primitive Data :"+a);
        Integer obj1=Integer.valueOf(a);
        System.out.println("Wrapper Class :"+a);
        Double obj2=Double.valueOf(a);
        System.out.println("Wrapper Class:"+a);
    
    }
}