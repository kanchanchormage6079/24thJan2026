package sub_classOf_AC;

import access_specifiers.*;
public class Access extends Parent {
    static void main(String[] args) {
        Access access = new Access();
        System.out.println(access.o);
        System.out.println(access.p);
        access.test();

        //creating object of parent class
        Parent p = new Parent();
        //System.out.println(p.o); ----> it is protected so cant access
        // using parent class object
        System.out.println(p.p);
    }
    public void test(){
        System.out.println(o);
    }
}
