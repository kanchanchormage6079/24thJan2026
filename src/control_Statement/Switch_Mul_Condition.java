package control_Statement;

public class Switch_Mul_Condition {
    static void main(String[] args) {
        //I want to check departments in Engg. collage as per building wise.
        String Dept = "Electrical";
        switch (Dept){
            case "Civil":
                System.out.println("Go to the 'C' Building");
                break;
            case "Mechanical":
                System.out.println("Go to the 'M' Building");
                break;
            case "Electrical":
                System.out.println("Go to the 'E' Building");
                break;
            case "Computer Science":
                System.out.println("Go to the 'CS' Building");
                break;
            case "Automobile":
                System.out.println("Go to the 'A' Building");
                break;
            case "Electronics_Telecommunication":
                System.out.println("Go to the 'E & TC' Building");
                break;
            default:System.out.println("Please enter valid Department Name!!!");
                break;
    }
}
}
