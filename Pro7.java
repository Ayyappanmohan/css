class Pro7
{
    public static void main(String[] args) {
        System.out.println("Main Start");
        System.out.println(a);
        m1();
        System.out.println(a);
        m2();
        System.out.println(a);
        int a=30;
        System.out.println(a);
        System.out.println(Pro7.a);
        System.out.println("Main End");
    }
    public static void m1()
    {
      a=10;
    }
    public static void m2()
    {
      a=20;
    }
}