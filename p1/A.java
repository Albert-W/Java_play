package p1;

public class A {
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;

    public int a(){return 1;}
    protected int b(){return 2;}
    int c(){return 3;}
    private int d(){return 4;}


    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.a);
        System.out.println(a1.b);
        System.out.println(a1.c);
        System.out.println(a1.d);
        System.out.println(a1.a());
        System.out.println(a1.b());
        System.out.println(a1.c());
        System.out.println(a1.d());
    }
}