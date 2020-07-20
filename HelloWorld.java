import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public class HelloWorld {

	static void print(String... args){
		for (String arg:args) {
			System.out.println(arg);
		}
	}

	public static void main(String[] args123) {
		
		// print("hello"," world");
		// System.out.println(String.format("Hi %s, your score is %.2f%!", "Bob", 59.5));
		// System.out.println(s.formatted("Alice", 80));
		// int i = Integer.getInteger("java.version"); 
		// System.out.println(i);
		byte[] b1 = "Hello".getBytes(); // 按系统默认编码转换，不推荐
		try {
			
			byte[] b2 = "Hello".getBytes("UTF-8"); // 按UTF-8编码转换
			System.out.println(Arrays.toString(b2));
		} catch (Exception e) {
			//TODO: handle exception
		}
		try {
			
			byte[] b3 = "Hello".getBytes("GBK"); // 按GBK编码转换
			System.out.println(Arrays.toString(b3));
		} catch (Exception e) {
			//TODO: handle exception
		}
		byte[] b4 = "Hello".getBytes(StandardCharsets.UTF_8); // 按UTF-8编码转换
		
		System.out.println(Arrays.toString(b1));
		System.out.println(Arrays.toString(b4));
	}
	
	public static class InnerClass {
		static int a = 10;
		public static void main(String[] args) {
			System.out.println("Hello, it's from inner class.");
		}
	}
    
}

class Tools{
	public transient int limit = 55;   // 不会持久化
	public int b; // 持久化
}


