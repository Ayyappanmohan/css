import java.util.Scanner;
class menu 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Order Please  \n IDLY \n DOSA \n VADA \n TEA ");
        
        int num=sc.nextInt();
        switch(num)
        {
          case 1:
            {
                System.out.println("Your Order This Is IDLY So,Please wait on min....");
               
                System.out.println("IDLY IS ON THE WAY"); 
            }
            break;
            case 2:
            {
                System.out.println("Your Order This Is DOSA So,Please wait on min....");
                
                System.out.println("DOSA IS ON THE WAY"); 
            }
            break;
            case 3:
            {
                System.out.println("Your Order This Is VADA So,Please wait on min....");
                
                System.out.println("VADA IS ON THE WAY");
            }
            break;
            case 4:
            {
                System.out.println("Your Order This Is TEA So,Please wait on min....");
                System.out.println("TEA IS ON THE WAY");
            }
            default:
            System.out.println("This Is Invalid Option");
            System.out.println("Please Enter Valid Option");
        }
    }
}