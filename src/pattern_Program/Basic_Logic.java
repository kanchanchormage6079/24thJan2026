package pattern_Program;

public class Basic_Logic {
    public static void main(String[] args){
        System.out.println("=======1 by 1 vertical=========");
        for(int i=1; i<=5; i++){
            System.out.println("*");
        }
        System.out.println("=======1 by 1 horizontal=========");
        for(int i=1; i<=5; i++){
            System.out.print("*");
        }
        System.out.println(); //------> to go in second line
        System.out.println("=======1 by 1 hori + space=========");
        for(int i=1; i<=5; i++){
            System.out.print("*  ");
        }
    }
}
