package customized_Exception;

public class Age_Exception {
    static void main(String[] args) {
        int age=70;
        if(age>60){
        throw new SeniorCitizen_Exception("Age must be greater than 60...");
        }
    }
}
