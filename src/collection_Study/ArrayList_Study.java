package collection_Study;

import java.util.ArrayList;

public class ArrayList_Study {
    static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add("kanchan");
        arrayList.add(null);
        arrayList.add("vaibhav");
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1,"Chormage");
        System.out.println(arrayList);

        // Methods of arraylist ------>>>>>
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        
        arrayList1.add(10);
        arrayList1.add(30);
        arrayList1.addFirst(20);
        arrayList1.addLast(50);
        arrayList1.add(0, 40);
        Object dup = arrayList1.clone();
        System.out.println(dup);
        boolean result = arrayList1.contains(40);
        System.out.println(result);
        boolean result1 = arrayList1.equals(dup);
        System.out.println(result1);
        System.out.println(arrayList1);
        Integer ele = arrayList1.get(1);
        System.out.println(ele);
        Integer ele1 = arrayList1.getFirst();
        System.out.println(ele1);
        int ele2 = arrayList1.getLast();
        System.out.println(ele2);
        int ele3 = arrayList1.indexOf(30);
        System.out.println(ele3);
        int ele4 = arrayList1.size();
        System.out.println("Length(size) of arraylist is "+ele4);
        //in arraylist of integer when we use remove method it
        // gives exception so use via index with element
        Integer ele5 = arrayList1.remove(0);
        System.out.println(ele5);
        System.out.println(arrayList1);
        arrayList1.add(0,5);
        System.out.println(arrayList1);
        arrayList1.removeFirst();
        arrayList1.removeLast();
        System.out.println(arrayList1);
        // set method update the element ----->>>
        Integer a1 = arrayList1.set(0, 10);
        System.out.println(a1);
        arrayList1.set(1, 20);
        System.out.println(arrayList1);
        boolean a2=arrayList1.isEmpty();
        System.out.println(a2);
        arrayList1.add(40);
        arrayList1.add(50);
        System.out.println(arrayList1);

        //print in regular format using (Regular for loop)
        System.out.println("===Regular for loop===");
        for(int i=0; i<=arrayList1.size()-1; i++)
        {
            System.out.println(arrayList1.get(i));
        }
        System.out.println("===for Each loop===");
        //print in regular format using (for each loop)
        for(Integer temp:arrayList1)
        {
            System.out.println(temp);
        }
        
        //data type of mehod ----->
        //Object ---> clone which give duplicate arraylist
        //boolean --->add, isEmpty, equals, contains
        //void --->addFirst, addLast
        //int ---> remaining all methods









    }
}
