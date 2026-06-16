package variable;

public class Another {
   public Another(){
       int e=50;
       int div=Variable_Study.b/e; //using static variable from another class
       System.out.println("The division is "+div);
   }
    public void test1(){
       Variable_Study variable = new Variable_Study(); //by creating object
        int add=variable.a+Variable_Study.b;  //using another class global variable
        System.out.println("The Addition is "+add);
    }

}


