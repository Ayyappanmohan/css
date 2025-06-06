public class Puppy extends Dog
{
    String breed2="Hucky";
    String color2="Gery with White";

    public void food2()
    {
        System.out.println("Eating Pedigree And Chicken");
    }

    public static void main(String[] args) {
        Animal a=new Animal();
        System.out.println(a.type);
        a.behaviour();
        Dog d=new Dog();
        System.out.println(d.breed1);
        d.food1();
        System.out.println(d.color1);
        Puppy p=new Puppy();
        System.out.println(p.breed1);
        System.out.println(p.breed2);
        System.out.println(p.color1);
        System.out.println(p.color2);
        System.out.println(p.type);
        p.food1();
        p.food2();
        p.behaviour();
    }
}