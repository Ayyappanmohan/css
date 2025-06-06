class Pro5
{
    static double d=4.9;

    static
    {
        System.out.println(d);
        d=5.6;
    }
    static
    {
        System.out.println(d);
        m1();
    }
    public static void main(String[] args) {
        System.out.println(d);
    }
    public static void m1()
    {
        d=3.2;
    }
}