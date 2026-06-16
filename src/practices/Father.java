package practices;

public class Father extends G_Father{
    int b=20;

    public void height(){
        System.out.println("Fathers height");
    }

    static void main(String[] args){
        Father father = new Father();
        father.nature();
        father.height();
        System.out.println(father.a);
        System.out.println(father.b);
    }
}
