import java.util.Scanner;

class Program13
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();

        int sum=0;
        int product=1;
        for(int i=1;i<=num;i++)
        {
            if(num%1==0)
            {
                sum=sum+i;
                product=product*i;
            }
            System.out.print(i+" ");
            
        }
            System.out.println("The Sum of Factor :"+sum);
            System.out.println("The Product of Factor :"+product);
    }
}