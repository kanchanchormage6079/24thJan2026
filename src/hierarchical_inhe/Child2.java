package hierarchical_inhe;

public class Child2 extends Parent_Study {
    int a=20;
    static String name="akshay";

    public void show(){
        System.out.println(super.a);
        System.out.println(super.name);
    }

    static void main(String[] args) {
        Child2 c = new Child2();
        System.out.println("=====child class property==========");
        c.show();
        System.out.println(c.a);
        System.out.println(Child2.name);
        System.out.println("=====parent class property==========");
        Child2.test();
    }
}
