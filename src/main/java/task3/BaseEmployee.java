package task3;

public abstract class BaseEmployee {
    private final static int BASIC_SALARY = 3000;
    private final String firstname;
    private final String lastName;
    private final int yearOfEmployment;
    private final int basicSalary;

    public BaseEmployee(String firstname, String lastName, int yearOfEmployment) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.yearOfEmployment = yearOfEmployment;
        this.basicSalary = BASIC_SALARY;
    }

    public BaseEmployee(String firstname, String lastName, int yearOfEmployment, int basicSalary) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.yearOfEmployment = yearOfEmployment;
        this.basicSalary = basicSalary;
    }

    public int calculateSeniority() {
        return 2022 - yearOfEmployment;
    }

    public abstract int calculateMonthlySalary();

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public int getBasicSalary() {
        return basicSalary;
    }
}
