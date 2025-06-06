import java.util.Scanner;
class program20
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt(); //145
        int temp=num;
        int lastDigit=0;
        int sum=0;

        while(num>0)
        {
            lastDigit=num%10; //5
            int fact=1;
            for(int i=1; i<=lastDigit ;i++);
            {
                fact=fact*i;
            }
            sum=sum+fact;

            num=num/10;
        }
        if (sum==temp)
         {
            System.out.println("This is Strong Number");
        }
        else{
            System.out.println("This is not a Strong number");
        }
    }
}