import java.util.Scanner;
class Program4
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=sc.nextInt();
        findLastDigit(num);
    }
    public static void findLastDigit(int a)
    {
        int lastDigit=a%10;
        System.out.println("The LastDigit :"+lastDigit);
    }
}