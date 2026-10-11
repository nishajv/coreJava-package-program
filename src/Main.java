
import Pkg1.*;
        import Pkg2.User;



public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello and welcome!");

        //File1 f1 = new File1();
        //System.out.println(f1.x);// non static variable calls with class object
        //System.out.println(File1.a); // static variable calls with class object

      /*  //File2
        File2 f2  = new File2(20,"deepali"); // data member initailze with constructor
        System.out.println(f2.x);
        System.out.println(f2.a);
       */

       /* //File3
        File3 f3 = new File3(20, "deepali");
        File3.nonReturnType1(); //static method call with class name
        f3.nonReturnType2(); // non static method call  with class object
        */

        // File4
        /*File4 f4 = new File4();
        int a = File4.staticReturnType1(); //static method: return type method stores in return type value
        String str = f4.nonStaticReturnType2();// non return type method stores in non return type value
        System.out.println(a);
        System.out.println(str);

         */

        //File5
        File5 f5 = new File5();
        User user = f5.nonstaticReturnType1();
        System.out.println(user);
        String str=f5.nonStaticReturnType2();
        System.out.println(str);
    }
}