public class Outter {
    private int a = 0;
    class Inner1{
        private int b = 1;
        private int ob = a + 1;
    }
    static class Inner4{
        private int e = 4;
        // private int oe = a + 3;
    }

    void anonymousFunc(Outter2 o){
        System.out.println(o.getd());
    }

    public static void main(String[] args) {
        class Inner2{
            private int c = 2;
            private int oc = new Outter().a + 2;
        }

        
        Outter o = new Outter();
        System.out.println(new Outter().a);
        System.out.println(o.new Inner1().ob);
        System.out.println(new Inner2().oc);
        o.anonymousFunc(new Outter2(){
            public int getd(){return 3+o.a;}
        });
        System.out.println(new Inner4().e);


    }

}

interface Outter2 {
    int getd();
}