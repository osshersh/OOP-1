package task3;

public class Manager extends BaseEmployee {
    private final static int BASIC_SALARY = 5000;
    private final static int BONUS = 500;

    public Manager(String firstName, String lastName, int yearEmployment, int basicSalary) {
        super(firstName, lastName, yearEmployment, basicSalary);
    }

    public Manager(String firstName, String lastName, int yearEmployment) {
        super(firstName, lastName, yearEmployment, BASIC_SALARY);
    }

    @Override
    public int calculateMonthlySalary() {
        return getBasicSalary() + BONUS;
    }
}
