package exception_Handling;

public class NullPointer_Ex {
    static void main(String[] args) {
        String a="kanchan";
        try{
        System.out.println(a.charAt(8));}
        catch (NullPointerException e){
            System.out.println("String can not ne null");
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("Plz enter valid index");
        }
    }
}
