package task3;

public class TicketSeller extends BaseEmployee {
    public TicketSeller(int yearEmployment) {
        super(yearEmployment);
    }

    @Override
    public double calculateMonthlySalary() {
        return getSalary();
    }

    @Override
    public double calculateSeniority() {
        return 2022 - yearEmployment;
    }
}
