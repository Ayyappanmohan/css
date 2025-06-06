import java.util.Scanner;
class Calculator
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Choice  \n1.Add \n2.Sub \n3.Mul \n4.Div");
        
        int choice=sc.nextInt();
        switch(choice)
        {
          case 1:
            {
                System.out.println("Enter The First Number");
                int a=sc.nextInt();
                System.out.println("Enter The Second Number");
                int b=sc.nextInt();
                int res=a+b;
                System.out.println("The Result is :"+res); 
            }
            break;
            case 2:
            {
                System.out.println("Enter The First Number");
                int a=sc.nextInt();
                System.out.println("Enter The Second Number");
                int b=sc.nextInt();
                int res=a-b;
                System.out.println("The Result is :"+res);
            }
            break;
            case 3:
            {
                System.out.println("Enter The First Number");
                int a=sc.nextInt();
                System.out.println("Enter The Second Number");
                int b=sc.nextInt();
                int res=a*b;
                System.out.println("The Result is :"+res);
            }
            break;
            case 4:
            {
                System.out.println("Enter The First Number");
                int a=sc.nextInt();
                System.out.println("Enter The Second Number");
                int b=sc.nextInt();
                int res=a/b;
                System.out.println("The Result is :"+res);
            }
            break;
            default:
            {
                System.out.println("Khatam....Tata ah....Goodu byei....gaiyae");
            }
        }
    }
}