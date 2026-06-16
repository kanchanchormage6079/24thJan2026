package exception_Handling;

public class Arithematic_Ex {
    static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("Plz divide non zero number");
        }

    }
}
