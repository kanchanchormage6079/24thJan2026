package logical_Program;

import java.util.*;

public class Big_Duplicate_Array {
    static void main(String[] args) {
        //int arr[]={10,10,20,20,40};
        //Print second last greatest number ----->>>>>
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(50);
        arr.add(40);
        arr.add(30);
        arr.add(20);
        arr.add(40);
        arr.add(50);
        System.out.println(arr);
        System.out.println(arr.get(arr.size()-2));
        System.out.println(Collections.max(arr));
        System.out.println(Collections.min(arr));

        //Remove duplicate number in array using hashset ----->>>>>
        Set<Integer> se = new HashSet<>(arr);
        System.out.println(se);

        //Remove duplicate number in array using treeset----->>>>>
        TreeSet<Integer> ts= new TreeSet<>(arr);
        System.out.println(ts);

        String []arr1={"kanchan","vaibhav","kanchan","akshay","vaibhav"};
        LinkedHashSet<String> li = new LinkedHashSet<>();
        for(String a:arr1){
            li.add(a);
        }
        System.out.println(li);
        System.out.println("=====Print in vertical line======");
        for(String t:li){
            System.out.println(t);
        }
    }


}
