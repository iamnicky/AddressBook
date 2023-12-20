
public class EmpPresentAbsent {
    public static void main(String[] args) {
        //constants
        int FULL_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == FULL_TIME) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
