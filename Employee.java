import java.io.*;
public class Employee{
   // 这个实例变量对子类可见
   public String name;

   //在构造器中对name赋值
   public Employee (String empName){
      name = empName;
   }
   //设定salary的值
   public void setSalary(double empSal){
      salary = empSal;
   }  
   // 私有变量，仅在该类可见
   private double salary;   
   // 打印信息
   public void printEmp(){
      System.out.println("名字 : " + name );
      System.out.println("薪水 : " + salary);
   }
 
   public static void main(String[] args){
      Employee empOne = new Employee("RUNOOB");
    //   empOne.setSalary();
      empOne.printEmp();
   }
}

