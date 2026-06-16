package logical_Program;

import java.util.Arrays;

public class Array_Program {
    static void main(String[] args) {
        //Array declaration, initialization & usage --old way
        int student[] = new int[4]; //----->declaration
        student[0] = 1;
        student[1] = 5;  //------>initialization
        student[2] = 10;
        System.out.println("Array at indexof 1 is ---> "+student[1]);
        System.out.println(student.length);
        System.out.println("=========================");

        //Array declaration, initialization & usage --new way
        String subject[] = {"kanchan","vaibhav","kiran","akshay","supriya"};
        System.out.println(subject[1]);
        System.out.println(subject.length);
        System.out.println("=========================");

        // i want to print all name ------------>>>>
        for(int i=0; i<=subject.length-1; i++){
            System.out.println(subject[i]);
        }
        System.out.println("=========================");

        // In 1 line with space ------------>>>>
        for(int i=0; i<=subject.length-1; i++){
           System.out.print(subject[i]+" ");
        }
        System.out.println();  // -----> it is for space after ans
        System.out.println("=========================");

        // for asending order ------------>>>>
        Arrays.sort(subject);
        for(int i=0; i<=subject.length-1; i++){
            System.out.println(subject[i]);
        }
        System.out.println("=========================");

        // for decending order ------------>>>>
        for(int i=subject.length-1; i>=0; i--){
            System.out.println(subject[i]);
        }





    }
}
