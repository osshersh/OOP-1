package task3;

public abstract class BaseEmployee {
    public String firstname;
    public String lastName;
    public final double salary;
    public final int yearEmployment;

    public double getSalary() {
        return salary;
    }

    public BaseEmployee(int yearEmployment) {
        this.yearEmployment = yearEmployment;
        this.salary = 3000;
    }

    public BaseEmployee(int yearEmployment, double salary) {
        this.yearEmployment = yearEmployment;
        this.salary = salary;
    }

    public double calculateSeniority() {
        return yearEmployment;
    }

    public abstract double calculateMonthlySalary();
}
