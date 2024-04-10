import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Employee implements BaseEntity, Serializable {
	private String emId;
	private String empName;
	private Boolean gender;
	private Date birthday;
	private String address;
	private String department;
	private String position;
	private double basicSalary;
	private double salaryRate;
	private double bonus;

    public Employee() {
        super();
    }

    public Employee(String emId, String empName, boolean gender, Date birthday, String address, String department, String position, double basicSalary, double salaryRate, double bonus) {
		super();
		this.emId = emId;
		this.empName = empName;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.department = department;
		this.position = position;
		this.basicSalary = basicSalary;
		this.salaryRate = salaryRate;
		this.bonus = bonus;
	}

	public String getEmId() {
		return emId;
	}

	public void setEmId(String emId) {
		this.emId = emId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSalaryRate() {
		return salaryRate;
	}

	public void setSalaryRate(double salaryRate) {
		this.salaryRate = salaryRate;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap emId: ");
		this.emId = sc.nextLine();
		System.out.print("Nhap empName: ");
		this.empName = sc.nextLine();
		System.out.print("Nhap gender: ");
		this.gender = sc.nextBoolean(); sc.nextLine();
		System.out.print("Nhap birthday: ");
		try {
			this.birthday = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
		System.out.print("Nhap address: ");
		this.address = sc.nextLine();
		System.out.print("Nhap department: ");
		this.department = sc.nextLine();
		System.out.print("Nhap position: ");
		this.position = sc.nextLine();
		System.out.print("Nhap basicSalary: ");
		this.basicSalary = sc.nextDouble(); sc.nextLine();
		System.out.print("Nhap salaryRate: ");
		this.salaryRate = sc.nextDouble(); sc.nextLine();
		System.out.print("Nhap bonus: ");
		this.bonus = sc.nextDouble(); sc.nextLine();
	}

	@Override
	public void display() {
		System.out.println("emId: "+emId);
		System.out.println("empName: "+empName);
		System.out.println("gender: "+gender);
		System.out.println("birthday: "+birthday);
		System.out.println("address: "+address);
		System.out.println("department: "+department);
		System.out.println("position: "+position);
		System.out.println("basicSalary: "+basicSalary);
		System.out.println("salaryRate: "+salaryRate);
		System.out.println("bonus: "+bonus);
	}

	@Override
	public double calculateSalary() {
		return basicSalary*salaryRate+bonus;
	}
}
