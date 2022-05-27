public class EmpPresOrAbs {
    private static  int WAGE_PER_HR =20;
    private static  int FULL_DAY_HR =8;
    public boolean isEmpPres()
    {
        boolean ifEmpPres=false;
        double random_num = Math.random();
        System.out.println(Math.random());
        if (random_num>0 && random_num <=0.5)
        {
            ifEmpPres= false;
        }
        else if ( random_num > 0.5 && random_num < 1)
        {
            ifEmpPres=true;
        }
        return ifEmpPres;
    }
    public  int dailyWage()
    {
        int daily_wage =0;
        boolean isEmpPresnt = isEmpPres();
        System.out.println("Today Employee is Present:"+ isEmpPresnt);

        if (isEmpPresnt)
        {
            //System.out.println("Today Employee is Present:");
            daily_wage = WAGE_PER_HR * FULL_DAY_HR;
        }
        else
        {
            daily_wage=0;
        }
        return daily_wage;
    }

    public static void main(String[] args) {
        EmpPresOrAbs empPres = new EmpPresOrAbs();
        //System.out.println("Today Employee is Present: " +empPres.isEmpPres());
        System.out.println("Today Wage is: " +empPres.dailyWage());
    }
}
