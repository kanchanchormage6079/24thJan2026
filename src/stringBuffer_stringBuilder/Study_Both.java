package stringBuffer_stringBuilder;

public class Study_Both {
    static void main(String[] args) {
        //String Class--->>>>>>>
        String name="velocity";
        String name1="Velocity java";
        System.out.println(name);
        System.out.println(name1);

        //StringBuffer Class--->>>>>>> It is thread-safe..(Synchronized)--Slower.
        StringBuffer n1 = new StringBuffer("velocity");
        n1.append(" java");
        System.out.println(n1);

        //StringBuilder Class--->>>>>>>It is not thread-safe..(Not Synchronized)--Faster.
        StringBuilder n2 = new StringBuilder("velocity");
        n2.append(" java");
        System.out.println(n2);

    }
}
