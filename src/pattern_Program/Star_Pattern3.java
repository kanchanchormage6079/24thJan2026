package pattern_Program;

public class Star_Pattern3 {
    static void main(String[] args) {
//        *****
//        ****
//        ***
//        **
//        *
        int row=5;
        int star=5; //-----> In 1st line
        for(int i=1; i<=row; i++){
            for(int j=1; j<=star; j++){
                System.out.print("*");
            }
            System.out.println();
            star--;
        }
    }
}


