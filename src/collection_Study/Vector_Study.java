package collection_Study;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Study {
    static void main(String[] args) {
        Vector<Object> vector = new Vector<>();

        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(4,60);
        vector.addFirst(15);
        vector.addLast(50);
        System.out.println(vector);
        // Methods in vector ------->>>>>
        vector.addElement(60);
        System.out.println(vector.get(4));
        System.out.println(vector.getFirst());
        System.out.println(vector.getLast());
        System.out.println(vector.elementAt(3));
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.lastIndexOf(30));  //>>>give index
        vector.insertElementAt(70,8);
        System.out.println(vector);

        System.out.println("======for loop======");
        for(int i=0; i<=vector.size()-1; i++){
            System.out.println(vector.get(i));
        }
        //for each loop
        System.out.println("====for each loop====");
        for(Object temp:vector){
            System.out.println(temp);
        }
        System.out.println("=====Iterator======");
       Iterator<Object> it=vector.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }
       it.remove();
        System.out.println(vector);
        System.out.println("======List Iterator=======");
        ListIterator<Object> lit=vector.listIterator();
        System.out.println("-------Has next---------");
        while(lit.hasNext()){
            System.out.println(lit.next());
        }
        System.out.println("-------Has previous---------");
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }
        lit.set(5);
        System.out.println(vector);
        lit.add(100);
        System.out.println(vector);

    }
}
