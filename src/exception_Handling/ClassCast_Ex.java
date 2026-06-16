package exception_Handling;

import java.util.TreeSet;

public class ClassCast_Ex {
    static void main(String[] args) {
        TreeSet<Object> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        //System.out.println(ts);
        try{
        ts.add("name");}
        catch (ClassCastException e){
            System.out.println("Plz enter integer value");
        }
        System.out.println(ts);
    }


}
