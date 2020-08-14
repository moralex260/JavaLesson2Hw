package package2;

import java.util.ArrayList;

public class Company {

    String companyName;
    ArrayList<Department> departmens=new ArrayList<>();
    ArrayList<Employee> employees=new ArrayList<>();

    public Company(String companyName, ArrayList<Department> departmens, ArrayList<Employee> employees) {
        this.companyName = companyName;
        this.departmens = departmens;
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", departmens=" + departmens +
                ", employees=" + employees +
                '}';
    }
}
