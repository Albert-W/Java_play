// public static int x = 100
public class HelloWorld {

	void print(String... args){
		for (String arg:args) {
			System.out.println(arg);
		}
	}

    public static void main(String[] args123) {
        // System.out.println("Hello world.");

        // System.out.println("Integer: " + Integer.SIZE/8);			// 4

		// System.out.println("Short: " + Short.SIZE/8);				// 2	
		// System.out.println("Long: " + Long.SIZE/8);					// 8
		// System.out.println("Byte: " + Byte.SIZE/8);					// 1
		// System.out.println("Character: " + Character.SIZE/8);		// 2
		// System.out.println("Float: " + Float.SIZE/8);				// 4
		// System.out.println("Double: " + Double.SIZE/8);				// 8
		// System.out.println("String: " + String.SIZE);				// 8
		boolean a = true ;
		System.out.println(a);
		float f = 300.456f;
		System.out.println(f);
		Tools tool1 = new Tools();
		System.out.println(tool1.limit);
		System.out.println((-1 >>> 1) );
		System.out.println((-16 & 16) );
		// String name = "James";
		// boolean result = name instanceof String; // 由于 name 是 String 类型，所以返回真
		byte b = 100;
		System.out.println( (byte)b + 30);
		// int x = 077;
		System.out.println( 077);

		new HelloWorld().print("hello", "world","!");
		assert b > 110 : "b must > 11jav0";


		String s = "Hello";
        System.out.println(s);
        s.toUpperCase();
		System.out.println(s);

		int[] ns = { 68, 79, 91, 85, 62 };
		System.out.println(ns.toString());
		// System.out.println({ 68, 79, 91, 85, 62 });
	
		System.out.println(0.0/0);
		// System.out.println(0/0);
		System.out.println(1.0/0);
		// System.out.println(1/0);
		System.out.println(-1.0/0);
		// System.out.println(-1/0);
		System.out.println((int)(-1.2 + 0.5));
		System.out.println(Math.round(12.5));
		System.out.println(Math.round(-12.5));
		System.out.println("%%");
		System.out.println("中文 显示");
		System.out.println("怎样不显示中文 ");
		System.out.println("怎样不显示汉语");
		// StringBuilder sb = "hello";
		// System.out.println(sb.append(" world"));
	}
	
	public class InnerClass {
		int a = 0;
	}
    
}

class Tools{
	public transient int limit = 55;   // 不会持久化
	public int b; // 持久化
}


