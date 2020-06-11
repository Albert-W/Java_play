public final class FinalTest {
    static int a = 100;
    final int b = 200;
    public static void main(String[] args) {
        a += 20;
        System.out.println(a);
        // b += 20;
        // System.out.println(b);
    }
}