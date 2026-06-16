package control_Statement;

public class If_ElseIf_Multiple_Condition {
    static void main(String[] args) {
        //you want to give signal information

        String signal="yellow";
        if (signal=="red")
        {
           System.out.println("Please Stop");
        }
        else if (signal=="green")
        {
            System.out.println("Please Go");
        }
        else if (signal=="yellow")
        {
            System.out.println("Please Wait");
        }
        else
        {
            System.out.println("Be Ready");
        }
    }
    }
