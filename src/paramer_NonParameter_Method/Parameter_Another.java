package paramer_NonParameter_Method;

public class Parameter_Another {
    public static void info1(){
        //I want to store Product Information -
        String name="Mobile";
        int id=57;
        float net_wt=1.34f;
        char grade='A';
        boolean quality=true;
        System.out.println("---Zero Parameters From Another Class---");
        System.out.println("Product name is "+name);
        System.out.println("Product Id is "+id);
        System.out.println("Product net_weight is "+net_wt);
        System.out.println("Product grade is "+grade);
        System.out.println("Product Quality is "+quality);
    }
    public void info2(String name, int people, long income,
                      char grade,boolean quality){
        //I want to store Department Information -
        System.out.println("---With Parameters From Another Class---");
        System.out.println("Department name is "+name);
        System.out.println("Total peoples in dept.are "+ people);
        System.out.println("Total income of dept. is "+income);
        System.out.println("Department grade is "+grade);
        System.out.println("Department Performance is "+quality);

    }
}
