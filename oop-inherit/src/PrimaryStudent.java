
public class PrimaryStudent extends Student {
	private int grade;
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGrade() {
		return grade;
	}
	public PrimaryStudent(String name, int age, int score, int grade) {
		// TODO Auto-generated constructor stub
		super(name,age,score);
		this.grade = grade;
	}

}
