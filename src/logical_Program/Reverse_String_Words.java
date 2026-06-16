package logical_Program;

public class Reverse_String_Words {
    static void main(String[] args) {
        String name="java is programming";
        String[] name1 = name.split(" ");
        //System.out.println(name1[0]);

        for (int i=name1.length-1; i>=0; i--){
            System.out.print(name1[i]+ " ");
        }
    }
}
