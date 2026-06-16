package practices;

public class Son extends Father {
    int c=5;

    public void weight(){
        System.out.println("Sons weight");
    }

    static void main(String[] args) {
        Son son = new Son();
        son.nature();
        son.height();
        son.weight();
        System.out.println(son.a);
        System.out.println(son.b);
        System.out.println(son.c);
        System.out.println("====================");
        System.out.println(son.m);
        System.out.println(son.n);
        System.out.println(son.o);
        System.out.println(son.p);
    }
    //Access specifiers
    private int m=10;
    int n=20;
    protected int o=30;
    public int p=40;
}
