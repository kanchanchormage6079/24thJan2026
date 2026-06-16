package looping_Statement;

public class For_Loop {
    static void main(String[] args){

        //I want to write sms for 5 times

        for(int a=1; a<=5; a++){
            System.out.println("This is Batch of Software Testing with AI");
        }
        // I want to print table of 3
        for(int a=3; a<=30; a=a+3){
            System.out.println(a);
        }

        //I want to print table of 9

        for(int b=1; b<=10; b++){
            System.out.println("9 * "+ b + " = "+(9*b));
        }
        System.out.println("===============================");
        // I want to print table of 9 in reverse order
        for(int c=10; c>=1; c--){
            System.out.println("9 * "+ c +" = "+(9*c));
        }

    }
}
