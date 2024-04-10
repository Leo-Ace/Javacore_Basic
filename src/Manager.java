import java.util.*;

public class Manager extends Employee{
    private double responsibilitySalary;

    public Manager() {
        super();
    }

    public Manager(double responsibilitySalary, String emId, String empName, boolean gender, Date birthday, String address, String department, String position, double basicSalary, double salaryRate, double bonus) {
        super(emId, empName, gender, birthday, address, department, position, basicSalary, salaryRate, bonus);
        this.responsibilitySalary = responsibilitySalary;
    }

    public double getResponsibilitySalary() {
        return responsibilitySalary;
    }

    public void setResponsibilitySalary(double responsibilitySalary) {
        this.responsibilitySalary = responsibilitySalary;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhap responsibilitySalary: ");
        this.responsibilitySalary = sc.nextDouble();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("responsibilitySalary: "+responsibilitySalary);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary()+responsibilitySalary;
    }
}
