package reflection;

import java.lang.reflect.Method;

// import p1.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 反射
        Class cls3 = Class.forName("p1.A");
        // 获取public字段"score":
        Method[] methods = cls3.getMethods();
        for(Method method : methods){
    System.out.println("method = " + method.getName());            
        }
        Class cls1 = p1.A.class;
        System.out.println(cls1.getName());

        //常规
        p1.A a = new p1.A();
        Class cls2 = a.getClass();
        System.out.println(cls2.getName());

        CharSequence cs = new StringBuilder();
        System.out.println(cs.getClass().getName());
    }    
}