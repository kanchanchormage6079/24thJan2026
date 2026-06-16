package variable;

public class Variable_Study {
    int a=10;  //Global non static variable
    static int b=100;   //Static global variable

    static void main(String[] args){
    Variable_Study variable = new Variable_Study();
    variable.Variable_Study();
    test(10);
    variable.test2();
    Another another = new Another();
    another.test1();
    }
    public void Variable_Study(){
        int a=10;
        int c=30;   //Local variable
        int add=this.a+c;  //Global Variable
        int sub=b-c;  //Static global variable
        System.out.println("The Addition is "+add);
        System.out.println("The Subtraction is "+sub);
    }
    public static void test(int d){
        Variable_Study variable1 = new Variable_Study();
        int add= variable1.a+d;
        int mul=b*d;  //Static global variable
        System.out.println("The multiplication is "+mul);
        System.out.println(b);
    }
    public void test2(){
        int a=10;
        int add=this.a+a;
        System.out.println("The Addition is "+add);
    }
}
