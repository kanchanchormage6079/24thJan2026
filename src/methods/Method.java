package methods;

public class Method {
    static void main(String[] args) {
        sample();
        // Creating object for non static method -
        Method method = new Method();
        // Calling non static method from same class-
        method.sample1();
        // Calling static method with parameter from another class-
        Parameter_method.test1(10, 20,"Kanchan");
        // Creating object for non static method -
        Parameter_method parameterMethod = new Parameter_method();
        // Calling non static method from another class-
        parameterMethod.test2();

    }

    public static void sample() {
        System.out.println("======Static Mtd.from same Class=======");
        System.out.println("My Class Name is Velocity");
    }

    public void sample1() {
        System.out.println("=====Non Static Mtd.from Same class======");
        System.out.println("Batch Name is 24Jan2026");
    }


}
