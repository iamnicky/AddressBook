public class EmpWagePartTime {
    public static void main(String[] args) {
        int FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int PART_TIME = 2;
        int empHrs = 0;
        int empWage = 0;

        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == PART_TIME) {
            empHrs = 4;
        } else if (empCheck == FULL_TIME) {
            empHrs = 8;
        } else {
            empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage : " + empWage);
    }
}
