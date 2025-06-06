import java.util.Scanner;

class Program3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=sc.nextInt();
        int lastDigit=num%10;
        System.out.println("The LastDigit :"+lastDigit);
    }
}