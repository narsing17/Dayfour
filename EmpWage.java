public class EmpWage {
    public static void main(String[] args) {
        int Emp_Rate_Per_Hour = 20;
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int Total_Working_hours = 100;
        int totalEmpWage = 0;

        while (totalEmpHrs <= Total_Working_hours || totalWorkingDays < totalWorkingDays)
        {
            totalWorkingDays++;

            double random = Math.random();

            switch (((int) (random*10) )% 2) {
                case 1:
                    System.out.println("\nEmployee is Present ");
                    empHrs = 8;
                    break;

                case 2:

                    System.out.println("\nEmployee is Part Time ");
                    empHrs = 4;
                    break;

                default:

                    System.out.println("\nEmployee is Absent ");
                    empHrs = 0;
                    break;
            }

            totalEmpHrs += empHrs;
            System.out.println("\ntotal day " + totalWorkingDays + " Emp Hrs" + totalEmpHrs);

        }
        totalEmpWage = totalEmpHrs * Emp_Rate_Per_Hour;
        System.out.println("\n" + totalEmpWage);
    }
}
