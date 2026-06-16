package pattern_Program;

public class Star_Pattern5 {
    static void main(String[] args) {
//             * * * * * *
//               * * * * *
//                 * * * *
//                   * * *
//                     * *
//                       *
// For this code increase onespace in space of sout statement..
        int row=6;
        int space=0;
        int star=6;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  "); //-----> here increse 1 space
            }
            for(int k=1; k<=star; k++){
                System.out.print("* "); //--->> here also increse
            }
            System.out.println();
            star--;
            space++;
        }

    }
}
