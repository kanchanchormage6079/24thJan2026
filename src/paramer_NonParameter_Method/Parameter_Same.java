package paramer_NonParameter_Method;

public class Parameter_Same {
    static void main(String[] args) {
        // Creating object -
        Parameter_Same parameter_same= new Parameter_Same();
        // calling non static method from same class -
        parameter_same.zero_parameter();
        // calling static method from same class -
        parameter(10,5);
        // calling static method from another class -
        Parameter_Another.info1();
        // Creating object for another class method-
        Parameter_Another parameter_another=new Parameter_Another();
        // calling non static method from another class -
        parameter_another.info2("BI",40,
                500000000, 'A',true);

    }
    public void zero_parameter(){
        //I want to make addition;
        int a=10; int b=20; int sum=a+b;
        //I want to make subtraction;
        int c=15; int d=6; int sub=c-d;
        System.out.println("---Zero Parameter From Same Class---");
        System.out.println("Addition is "+sum);
        System.out.println("Subtraction is "+sub);
    }
    public static void parameter(int a,int b){
        int mul=a*b; int div=a/b;
        System.out.println("---With Parameters From Same Class---");
        System.out.println("Multiplication is "+mul);
        System.out.println("Division is "+div);
    }


}
