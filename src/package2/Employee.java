package package2;

public class Employee {
   private String name;
   private String lastName;
   private double experience;
    private String position;

    public Employee(String name, String lastName, double experience, String position) {
        this.name = name;
        this.lastName = lastName;
        this.experience = experience;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", experience=" + experience +
                ", position='" + position + '\'' +
                '}';
    }
}
