public abstract class PersonC {
    String name = "bcd";
    private int age;

    // abstract String getName();
    // public void setName(String name) {...}
    // public int getAge() {...}
    // public void setAge(int age) {...}
    public void display(){
        System.out.println(age);
    }
}

class Student extends PersonC {
    // 不要重复name和age字段/方法,
    // 只需要定义新增score字段/方法:
    private int score;
    String name = "abc"; 
    // public int getScore() { … }
    // public void setScore(int score) { … }
    @Override
    public void display(){
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
        // System.out.println(super.name);
    }
}