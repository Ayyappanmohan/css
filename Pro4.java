class Pro4
{
    static float f;

    static
    {
        System.out.println(f);
        test();
    }
    public static void main(String[] args) {
        float f=5.6f;
        System.out.println(f);
    }
    public static void test()
    {
        System.out.println("test is executed");
        f=4.5f;
    }
}