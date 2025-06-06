class School
{
    static String address ="Chennai";

    static{
        System.out.println("Welcome");
    }
    static int noOfStudents;
    public static void display()
    {
        System.out.println("All D Best");
    }
    public static void main(String[] args)
    {
        System.out.println("Main Start");
        int a=10;
        display();
        System.out.println(noOfStudents);
        System.out.println(address);
        System.out.println("Main End");
    }
}