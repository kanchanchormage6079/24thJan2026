package string_Methods;

public class Methods {
    public static void main(String[]args){
        //length()
        String k="kanchan";
        int k1=k.length();
        System.out.println("Given string length is "+k1);
        //toUppercase
        String k2=k.toUpperCase();
        System.out.println("Given string is "+k2);
        //toLowercase
        String k3=k.toLowerCase();
        System.out.println("Given string is "+k3);
        //equals
        String a="ABC";
        String b="ABC";
        String c="abc";
        boolean a1=a.equals(c);
        System.out.println(a1);
        //equalsIgnoreCase
        boolean a2=a.equalsIgnoreCase(c);
        System.out.println(a2);
        System.out.println(a.equalsIgnoreCase(b));
        //contains
        String a3="kanchan";
        System.out.println(a3.contains("chant"));
        //isEmpty & isBlank
        String a4="";
        String a5="  ";
        System.out.println(a4.isEmpty());
        System.out.println(a5.isEmpty());
        System.out.println(a4.isBlank()); //--> length 0
        System.out.println(a5.isBlank()); //--> whitespace
        //charAt
        String a6="kanchan";
        System.out.println(a6.charAt(3));
        //endsWith & startsWith
        System.out.println(a6.endsWith("an"));
        System.out.println(a6.startsWith("k"));
        //substring
        System.out.println(a6.substring(1)); //-->it give to last
        System.out.println(a6.substring(3,6)); //-->it give between
        //concat
        String d="kanchan";
        String e="vaibhav";
        System.out.println(d.concat(" "+e));
        //indexOf
        System.out.println(d.indexOf('n'));
        System.out.println(d.indexOf("ch"));
       //lastIndexOf
        System.out.println(d.lastIndexOf('a'));
        //replace
        System.out.println(d.replace('a','c'));

        //Split
        String q="java is programming";
        String[] q1 = q.split(" ");
        for (String q2:q1){
            System.out.println(q2);
        }






    }
}
