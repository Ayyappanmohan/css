import java.util.Scanner;
class Swapping
{
    public static void main(String[] args)
     {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter The Number");
        int a=sc.nextInt();

        System.out.println("Enter The Number");
        int b=sc.nextInt();

        System.out.println("=============== Before Swapping =============");
        System.out.println("a-->"+a);
        System.out.println("b-->"+b);

        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("=============== After Swapping =============");
        System.out.println("a-->"+a);
        System.out.println("b-->"+b);
    }
}
        
         
         