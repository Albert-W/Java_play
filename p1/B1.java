package p1;

public class B1 extends B {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.a);
        System.out.println(a1.b);
        System.out.println(a1.c);
        // System.out.println(a1.d);   
        System.out.println(a1.a());
        System.out.println(a1.b());
        System.out.println(a1.c());
        //System.out.println(a1.d());     
    }    
    
}