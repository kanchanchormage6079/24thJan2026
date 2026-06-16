package cursor_study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_ListIterator_Study {
    static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        System.out.println(arrayList);

        // Iterator  ------>>>>>
        Iterator<Object> ite = arrayList.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
           // ite.remove();
        }
        System.out.println(arrayList);

        // ListIterator ----->>>>
        ListIterator<Integer> lit = arrayList.listIterator();
        while (lit.hasNext()){
            System.out.println(lit.next());
        }

        System.out.println("=====previous give reverse======");
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }
        lit.remove();  //it remove 1st element bcz of
        System.out.println("Remove 1st bcz cur there ---> "+arrayList); //cursor on 1st

        System.out.println("====again in original====");
        while (lit.hasNext()){
            System.out.println(lit.next());
        }
        lit.set(5);
        System.out.println("update last bcz cur there ---> "+arrayList);

        System.out.println("====Adding element====");
        lit.add(60);
        System.out.println("add on last bcz cur there ---> "+arrayList);

    }
}
