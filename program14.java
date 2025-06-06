import java.util.Scanner;
 class Program14
 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=sc.nextInt();

        int lastDigit=0;
        int sum=0;
        int product=1;
         while(num>0)
         {
            lastDigit=num%10;
            sum=sum+lastDigit;
            product=product*lastDigit;

            num=num/10;
         }
         if (sum==product) {
            System.out.println("This is Spy Number");
         }
         else{
            System.out.println("This is Not a Spy Number");
         }
    }
 }