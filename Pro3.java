class Pro3
{
    static boolean b;

    static String name="Alan";

    static
    {
        System.out.println(b);
    }
    public static void main(String[] args) {
        System.out.println(b);
        System.out.println(name);
    }
    static
    {
        b=true;
    }
}