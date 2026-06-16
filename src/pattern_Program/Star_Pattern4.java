package pattern_Program;

public class Star_Pattern4 {
    static void main(String[] args) {
//        *
//       **
//      ***
//     ****
//    *****
//   ******
        int row=6;
        int space=5;
        int star=1;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=star; k++){
                System.out.print("*");
            }
            System.out.println();
            star++;
            space--;
        }


    }
}
