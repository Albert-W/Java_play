// 文件名 : ExcepTest.java
public class ExcepTest{
    public static void main(String args[]){
        int a[] = new int[2];
        try{
           System.out.println("Access element three :" + a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Exception thrown  :" + e);
        }
        // a[0] = 10;
        finally{
           a[0] = 6;
           System.out.println("First element value: " +a[0]);
           System.out.println("The finally statement is executed");
        }
    }

   public void deposit(double amount) throws RuntimeException
   {
     // Method implementation
      new RuntimeException();
   }
   //Remainder of class definition
}

