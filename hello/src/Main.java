import java.io.*;
import java.util.Arrays;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("AaAaAa".hashCode());
		System.out.println("BBAaBB".hashCode());
		System.out.println(new Pair(1,2).hashCode());
		
//		System.out.println( );
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
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try (ObjectOutputStream output = new ObjectOutputStream(buffer)) {
            // 写入int:
            //output.writeInt(12345);//[-84, -19, 0, 5, 119, 4, 0, 0, 48, 57]
            // 写入String:
            //output.writeUTF("Hello");//[-84, -19, 0, 5, 119, 7, 0, 5, 72, 101, 108, 108, 111]
            // 写入Object:
            output.writeObject(Double.valueOf(123.456));//[-84, -19, 0, 5, 115, 114, 0, 16, 106, 97, 
        }
        System.out.println(Arrays.toString(buffer.toByteArray()));
        
        StringWriter buffer2 = new StringWriter();
        try (PrintWriter pw = new PrintWriter(buffer2)) {
            pw.println("Hello");
            pw.println(12345);
            pw.println(true);
        }
        System.out.println(buffer2.toString());
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
