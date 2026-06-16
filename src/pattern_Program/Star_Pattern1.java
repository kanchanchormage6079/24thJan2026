package pattern_Program;

public class Star_Pattern1 {
    static void main(String[] args) {
//        * * * * *
//        * * * * *
//        * * * * *
        // Always count Row, Col(no need), Star in 1st row & Space....

        int row=3;
        int col=5;   //-----> max. star in pattern in a line
    // for symmentry pattern there is no need to count
    // Star in 1st line & also 1st line Space if it is in left side...

        // Outer for loop for Row ------>
        for(int i=1; i<=row; i++){
            // Inner for loop for Column ------>
            for(int j=1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// In Printing statement ----->>>>>>
// if we give Star name instead of  * then result = decremenntal number
// if we give Spe. like 5 or 'A' instead of  * then
// result = decremenntal same number or letter or name alse ...
