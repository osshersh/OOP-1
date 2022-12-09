package task3;

public class TicketSeller extends BaseEmployee {

    public TicketSeller(String firstName, String lastName, int yearOfEmployment) {
        super(firstName, lastName, yearOfEmployment);
    }

    public TicketSeller(String firstName, String lastName, int yearOfEmployment, int basicSalary) {
        super(firstName, lastName, yearOfEmployment, basicSalary);
    }

    @Override
    public int calculateMonthlySalary() {
        return getBasicSalary();
    }
}
