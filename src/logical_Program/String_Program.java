package logical_Program;

import java.util.Locale;

public class String_Program {
    static void main(String[] args) {
        //make reverse string -------------->
        String name="Mo   m   ";
        String a1="";
        for(int i=name.length()-1; i>=0; i--){
            char tem=name.charAt(i);
            a1=a1+tem;
            //Or-->> a1=a1+name.charAt(i);
        }
        System.out.println("Reverse String is "+a1);
        System.out.println("Original String is "+name);

        //check palindrome string ------------>
        if(a1.equalsIgnoreCase(name)){
           System.out.println("Given string is palindrome");
        }
        else{
          System.out.println("Given string is not palindrome");

        }
        // check blank space ------------>
        int count=0;
        for(int i=0; i<=name.length()-1; i++){
             char t=name.charAt(i);
             if(t == ' '){
                 count++;
             }
        }
        System.out.println(count);

        // check character with space ------->
        int count2=0;
        for(int i=0; i<name.length(); i++){
            count2++;
        }
        System.out.println(count2);

        // check occurance of specific letter in string ------->
        String k1="kanchan";
        int count3=0;
        for(int i=0; i<=k1.length()-1; i++){
            char t = k1.charAt(i);
            if(t == 'a'){
                count3++;
            }
        }
        System.out.println(count3);

        //Find out vowels in given String ------->>>>>>
        String str="Automation";
        str=str.toLowerCase();
        int count1=0;
        for(int i=0; i<=str.length()-1; i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' ||
               ch=='o' || ch=='u'){
                count1++;
            }
        }
        System.out.println("Total Vowels is "+count1);













    }


}
