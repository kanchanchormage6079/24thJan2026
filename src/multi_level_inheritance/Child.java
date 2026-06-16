package multi_level_inheritance;

public class Child extends Father {
    int a=10;
    static String name= "xyz";

    static void main(String[] args) {
        hobbies(); // static method same class
        Child child = new Child(); // creating object of same class
        child.nature();  // calling non static method of same class
        System.out.println("======================================");
        child.height();
        child.weight();
        System.out.println(name);
        System.out.println(child.a);
        System.out.println(child.c);
        System.out.println(child.e);
    }

    public static void hobbies(){
        System.out.println("Child's Hobbies");
    }

    public void nature(){
        System.out.println("Child's Nature");
    }

}
