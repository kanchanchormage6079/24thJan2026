package static_Nonstatic_Method;

public class TestMethod_Same {
    static void main(String[] args) {
        name();
        education();
        age();

        //to called static method from another class -
        AnotherMethod.test();

        //to create object for non static method -
        TestMethod_Same testMethod = new TestMethod_Same();
        //to called non static method from another class -
        testMethod.test1();
    }
    //static regular method from same class -
    public static void name() {
        System.out.println("My Name is Kanchan");
    }

    public static void education() {
        System.out.println("My Education is B-tech Civil Engineering");
    }

    public static void age() {
        System.out.println("My Age is 26Year");
    }

    //Non Static regular method from same class -
    public void test1() {
        System.out.println("This is Non Static Method from same class--test1");
    }

}
