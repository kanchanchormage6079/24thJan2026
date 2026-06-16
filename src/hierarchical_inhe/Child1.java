package hierarchical_inhe;

public class Child1 extends Parent_Study {
    int a=20;
    static String name="vaibhav";

    public void show(){

        System.out.println("child1 class mehod");
    }

    public void show1(){
        System.out.println(super.a);
        System.out.println(super.name);
    }
    public static void main(String[] args){
        Child1 c = new Child1();
        System.out.println("=====child class property==========");
        c.show();
        c.show1();
        System.out.println(c.a);
        System.out.println(Child1.name);
        System.out.println("=====parent class property==========");
        Child1.test();
        System.out.println(Child1.name);

    }
}
