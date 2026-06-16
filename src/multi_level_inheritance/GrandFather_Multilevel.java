package multi_level_inheritance;

public class GrandFather_Multilevel {
    int m = 10;
    String emp = "Vaibhav";

    static void main(String[] args) {
        GrandFather_Multilevel mul = new GrandFather_Multilevel();
        mul.test2();
        test1();
        System.out.println(mul.m);
        System.out.println(mul.emp);
    }

    public static void test1() {
        System.out.println("Super class static method---test1");
    }

    public void test2() {
        System.out.println("Super class non static method---test2");
    }

}
