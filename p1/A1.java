package p1;

public class A1 extends A{
    public static void main(String[] args) {
        A1 a1 = new A1();
        System.out.println(a1.a);
        System.out.println(a1.b);
        System.out.println(a1.c);
        // System.out.println(a1.d);       
        System.out.println(a1.a());
        System.out.println(a1.b());
        System.out.println(a1.c());
        // System.out.println(a1.d());
        A a2 = new A();
        System.out.println(a2.a);
        System.out.println(a2.b);
        System.out.println(a2.c);
        //System.out.println(a2.d);              
        System.out.println(a2.a());
        System.out.println(a2.b());
        System.out.println(a1.c());
        //System.out.println(a1.d());         
    }
    
}