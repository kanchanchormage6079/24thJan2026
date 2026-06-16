package looping_Statement;

public class While_Loop {
    static void main() {
        //I want to print table of 6
        int a=6;
        while(a<=60){
            System.out.println(a);
            a=a+6;
        }
        System.out.println("====================");
        //I want to print table of 6 in reverse manner
        int b=60;
        while(b>=6){
            System.out.println(b);
            b=b-6;
        }
    }
}
