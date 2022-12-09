package task3;

public class TicketSeller extends BaseEmployee {
    public final static int BASIC_SALARY = 3000;

    public TicketSeller(String firstName, String lastName, int yearOfEmployment) {
        super(firstName, lastName, yearOfEmployment, BASIC_SALARY);
    }

    public TicketSeller(String firstName, String lastName, int yearOfEmployment, int basicSalary) {
        super(firstName, lastName, yearOfEmployment, basicSalary);
    }

    @Override
    public int calculateMonthlySalary() {
        return BASIC_SALARY;
    }
}
