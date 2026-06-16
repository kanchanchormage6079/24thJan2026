package exception_Handling;

public class BlockOf_try_catch_finally {
    static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch (NullPointerException e){
            System.out.println("Plz enter not null value");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Plz enter valid index");
        }
        catch(ArithmeticException e){
            System.out.println("Plz divide by non zero no.");
        }
        catch (Exception e){
            System.out.println("something went wrong");
        }
        finally {
            System.out.println("finally block executed");
        }
    }
}
