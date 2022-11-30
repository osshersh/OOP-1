package task3;

public class TicketSeller extends BaseEmployee {

    public TicketSeller(int yearEmployment, double salary) {
        super(salary, yearEmployment);
    }

    @Override
    public double calculateMonthlySalary() {
        return salary;
    }

    @Override
    public int getExperienceYear() {
        short presentYear = 2022;
        return 2022 - yearEmployment;
    }
}
