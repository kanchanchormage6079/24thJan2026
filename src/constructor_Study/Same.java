package constructor_Study;

public class Same {
    static void main(String[] args) {
        //creating object for same class & then constru.auto.invoked.
        Same sample = new Same();
        Same sample1 = new Same(10,5);
        //creating object for another class & then constru.auto.invoked.
        Another another = new Another();
        Another another1 = new Another(100,10);
    }
    public Same(){
        int a=10;
        int b=20;
        int add=a+b;
        System.out.println("The Addition is "+add);
    }

    public Same(int a, int b){
        int sub=a-b;
        System.out.println("The subtraction is "+sub);
    }
}
