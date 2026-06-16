package control_Statement;

public class Nested_IfElse {
    static void main(String[] args){
        //I want to check username & password in nested ifelse condition.

        String username="Sample";
        String password="Sample@1234";
        if (username=="Sample")
        {
            System.out.println("Given username is Correct, plz enter pass..");
            if (password=="Sample@123")
            {
                System.out.println("Password is correct, Login Success!!");
            }
            else
            {
                System.out.println("Password is incorrect");
            }
        }
        else
        {
            System.out.println("Plz enter correct username");
        }

    }
}
