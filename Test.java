public class Test {
    public static void main(String args[]) {
       int [] numbers = {10, 20, 30, 40, 50};
        
        for (int i :numbers){

            for(int x : numbers ) {
                // x 等于 30 时跳出循环
                if( x == 30 ) {
                    break;
                }
                System.out.print( x * i );
                System.out.print("\n");
            }
        }
    }
 }