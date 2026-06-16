package logical_Program;

public class Swapping_Program {
    static void main(String[] args) {
        // Swapping of two numbers with 3rd variable --------->
        int a=10;
        int b=20;
//      int c=a;
//      a=b; //20
//      b=c; //10
//      System.out.println("value of a = "+a);
//      System.out.println("value of b = "+b);

        // Swapping of two numbers without 3rd variable --------->
        a=a+b; //10+20=30
        b=a-b;//30-20=10
        a=a-b;//30-10=20
        System.out.println("value of a = "+a);
        System.out.println("value of b = "+b);
    }
}
