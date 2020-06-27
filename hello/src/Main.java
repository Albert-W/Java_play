
/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Java!");
		
		Pair<Integer> p = new Pair<>(2,3);
		System.out.println(p.getFirst());
		
//		Pair<String> p2 = Pair.create("1","2");
//		System.out.println(p2.getLast());
		p.setFirst(20);
		p.setLast(30);
		
		System.out.println(p.getFirst());
		System.out.println(p.getClass().getName());
		
        Pair<Integer> p3 = new Pair<>(123, 456);
        int n = add(p3);
        System.out.println(n);
	}
	
    static int add(Pair<? extends Number> p) {
        Number first = p.getFirst();
        Number last = p.getLast();
        return first.intValue() + last.intValue();
    }
    
//    int set(Pair<? extends Number> p) {
//        Number first = p.getFirst();
//        Number last = p.getLast();
//        p.setFirst(new Integer(first.intValue() + 100);
//        p.setLast(new Integer(last.intValue() + 100));
//        return p.getFirst().intValue() + p.getFirst().intValue();
//    }

}
