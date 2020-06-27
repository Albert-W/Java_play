
public class Person {

	// TODO
	private static int count=0;

	String name;

	public Person(String name) {
		this.name = name;
		count +=1;
	}
	public static int getCount() {
		return count;
	}
	
	protected void finalize() {
		count -= 1;
	}

}
