class demo1
{
    public static void main(String[] args)
 {
    System.out.println("Main Begins");
    ram();
    sita();
    System.out.println("Main Ends");
}
public static void sita()
{
    System.out.println("hi..!From Sita()");
}
public static void ram()
{
    System.out.println("Ram Begins");
    sita();
    System.out.println("Ram End");
}
}