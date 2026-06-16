package logical_Program;

import java.util.Arrays;

public class Anagram_String {
    static void main(String[] args) {
        //Lettters in both strings must be same not matter in which sequence------->>
        String s1="test";
        String s2="test";

        char a1[]=s1.toCharArray();
        char a2[]=s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1,a2)){
            System.out.println("Given strings are anagram");
        }
        else{
            System.out.println("Given strings are not anagram");
        }
    }
}
