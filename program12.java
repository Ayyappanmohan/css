import java.util.Scanner;
class Program12
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=sc.nextInt();

        int lastDigit=0;
        int even_sum=0;
        int even_product=1;
        int odd_sum=0;
        int odd_product=1;

        while(num>0)
        {
            lastDigit=num%10;
            if(lastDigit%2==0)
            {
                odd_sum=odd_sum+lastDigit;
                odd_product=odd_product*lastDigit;
            }
            else
            {
                even_sum=even_sum+lastDigit;
                even_product=even_product*lastDigit;
            }
            num=num/10;
        }
        System.out.println("Odd_sum :"+odd_sum);
        System.out.println("Odd_product :"+odd_product);

        System.out.println("Even_sum :"+even_sum);
        System.out.println("Even_product :"+even_product);
    }
}