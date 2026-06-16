package access_specifiers;

public class Parent {
    //Access specifiers
    private int m=10;
    int n=20;
    protected int o=30;
    public int p=40;

    static void main(String[] args){
        Parent parent =new Parent();
        System.out.println(parent.m);
        System.out.println(parent.n);
        System.out.println(parent.o);
        System.out.println(parent.p);
    }
}
