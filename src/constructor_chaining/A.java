package constructor_chaining;

public class A {
    static void main(String[] args) {
        A a = new A();
    }
    public A(){
        this(9,10);
        System.out.println("zero parameter constructor");
    }

    public A(int a, int b){
        int c=a+b;
        System.out.println("with parameter constructor --- "+ c);
    }
}
