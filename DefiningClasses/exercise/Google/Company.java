package DefiningClasses.exercise.Google;

public class Company {

    private String company;
    private String department;
    private double salary;


    Company(String company, String department, double salary) {
        this.company = company;
        this.department = department;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
