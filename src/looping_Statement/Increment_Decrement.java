package looping_Statement;

public class Increment_Decrement {
    static void main() {
        // i want to perform pre incerement & decrement
        int a=10;
        int b=++a;
        int c=--a;
        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
        System.out.println("=============================");

        // i want to perform post incerement & decrement
        int d=10;
        int e=20;
        int f=d++;
        int g=e--;

        System.out.println(f);
        System.out.println(d);

        System.out.println(g);
        System.out.println(e);


    }
}
