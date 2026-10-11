package Pkg1;

import Pkg2.User;

public class File5 {
    public Integer x=30;
    public String a="Nisha";




    // Static method ( return type)
    public User nonstaticReturnType1(){
        User user = new User();
        user.setAge(x);
        user.setName(a);
        return user;
    }
    // non static method (return type)

    public String  nonStaticReturnType2(){

        //System.out.println("Return non static method");

        int y=File4.staticReturnType1();
        System.out.println(y);
        return a;

    }
}