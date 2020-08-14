package package2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Department>departmens=new ArrayList<>();

       departmens.add(new Department("javaGroupe")) ;
       departmens.add( new Department("python"));
       departmens.add( new Department("jsGroupe"));
       ArrayList<Employee> employees=new ArrayList<>();
       employees.add(new Employee("Vasya","Otvertkin",5,"bad student"));
             Employee seryj=  new Employee("Serhij", "Zhuravlev",5,"mentor");
             Employee taras= new Employee("Taras","Danylyshyn",0.5,"student");
             employees.add(seryj);
             employees.add(taras);
              Company octenweb= new Company("octenweb",departmens,employees);
        System.out.println(octenweb);

    }

}
