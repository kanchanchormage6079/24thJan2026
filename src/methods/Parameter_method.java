package methods;

public class Parameter_method {
    public static void test1(int a, int b,String name){
        int add=a+b;
        int sub=a-b;
        System.out.println("=======Static mtd With Para. & diff. class========");
        System.out.println("Addition is "+add);
        System.out.println("Subtraction is "+sub);
        System.out.println("My name is "+name);
    }
    public void test2(){
        int a=10;
        int b=5;
        int mul=a*b;
        int div=a/b;
        System.out.println("=======Non Static mtd without Para. & diff. class========");
        System.out.println("Multiplication is "+mul);
        System.out.println("Division is "+div);

    }
}
