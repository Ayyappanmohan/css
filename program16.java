import java.util.Scanner;
class Program16
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=sc.nextInt();

        int square=num*num;
        int lastDigit=0;
        int sum=0;

        while(square>0)
        {
            lastDigit=square%10;
            sum=sum+lastDigit;
            square=square/10;
        }
        if (sum==num) {
            System.out.println("This is the Neon Number");
            
        }
        else{
            System.out.println("This is Not a Neon Number");
        }
    }
}