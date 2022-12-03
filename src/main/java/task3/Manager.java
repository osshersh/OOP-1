package task3;

public class Manager extends BaseEmployee {
    public double bonus = 500;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(int yearEmployment, double salary) {
        super(yearEmployment, salary);
    }

    public Manager(int yearEmployment) {
        super(yearEmployment, 5000);
    }

    @Override
    public double calculateMonthlySalary() {
        return getSalary() + bonus;
    }

    @Override
    public double calculateSeniority() {
        return 2022 - yearEmployment;
    }
}
