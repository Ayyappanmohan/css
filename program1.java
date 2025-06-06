import java.util.Scanner;

class Program
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");

        int a=sc.nextInt();

        if (a>=0)
         {
          System.out.println("This is Positive Number");
        }
        else
        {
            System.out.println("This is Negative Number");
        }
    }
}