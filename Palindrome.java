import java.util.Scanner;
class Palindrome
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=sc.nextInt();

        int temp=num;
        int lastDigit=0;
        int rev=0;
         while(temp>0)
         {
            lastDigit=temp%10;
            rev=rev*10+lastDigit;
            temp=temp/10;
         }
         
         if (num==rev) 
         {
            System.out.println("This is a Palindrome Number");
         }
         else
         {
            System.out.println("This is Not a Palindrome Number");
         }
    }
}