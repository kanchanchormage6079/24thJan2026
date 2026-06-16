package exception_Handling;

public class IndexOutOfBound_Ex {
    static void main(String[] args) {
        //ArrayIndexOutOfBoundException --------->>>>
//        int ar[] ={1, 2, 3};
//        try{
//        System.out.println(ar[3]);}
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Plz enter valid index");
//        }

        //StringIndexOutOfBoundException --------->>>>
        String name="pune";
        try{
        System.out.println(name.charAt(4));}
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Plz enter valid index");
        }
    }
}
