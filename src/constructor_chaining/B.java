package constructor_chaining;

public class B extends A{
    static void main(String[] args) {
        B b = new B();
    }
    public B(){
        this("kanchan");
        int a=10;
        int b=20;
        int c= a+b;
        System.out.println("Addition is "+c);
    }

    public B(String name){
        super();
        System.out.println("String para constructor");
    }
}
