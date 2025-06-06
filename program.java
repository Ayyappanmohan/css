class Message
{
    public static void main(String[] args)
 {
    System.out.println("Main Begins");
    naveen();
    System.out.println("Main Ends");
}
public static void aakash()
{
    System.out.println("hi..!From Aakash()");
    
    System.out.println("I Am Fine , You");

}
public static void naveen()
{
    System.out.println("hi..!From Naveen()");
    System.out.println("how are you");
    aakash();
    System.out.println("I Am Fine");
    System.out.println(" OK Bye ");

}
}