package pattern_Program;

public class Butterfly_Pattern {
    static void main(String[] args) {
//             *         *
//             **       **
//             ***     ***
//             ****   ****
//             ***** *****
//             ****   ****
//             ***     ***
//             **       **
//             *         *
        int row=9;
        int star1=1;
        int space1=4;
        int star2=1;
        int space2=5;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=star1; j++){
                System.out.print("*");
            }
            for(int k=1; k<=space1; k++){
                System.out.print(" ");
            }
            for(int l=1; l<=space2; l++){
                System.out.print(" ");
            }
            for(int m=1; m<=star2; m++){
                System.out.print("*");
            }
            System.out.println();
            if(i<5){
                star1++;
                space1--;
                star2++;
                space2--;
            }
            else{
                star1--;
                space1++;
                star2--;
                space2++;
            }
        }
    }
}
