import java.util.Scanner;
class Armstrong
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=sc.nextInt();
        int temp=num;
        int temp2=num;
        int lastDigit=0;
        int sum=0;
        int count=0;
        while(temp>0)
        {
            temp=temp/10;
            count++;
        }
        System.out.println(count);
        while(temp2>0)
        {
            lastDigit=temp2%10;
            int result=1;
            for (int i=1;i<=count;i++)
            {
            result*=lastDigit;
            }
            temp2=temp2/10;
            sum+=result;
    }
        if(num==sum)
        {
            System.out.print("Armstrong number is :"+num);
        }
        else
        { 
            System.out.print("Not a Armstrong number is :"+num);
        }
    }
}