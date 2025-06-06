import java.util.Scanner;
class Program6
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=sc.nextInt();
        findSingleDigit(num);
    }
    public static void findSingleDigit(int a)
    {
        int res=a/10;
        System.out.println("The Result Is :"+res);
    }
}