package package3;

import java.util.Date;

public class Client {
   private String name;
   private String lastName;
   private String bd;
   private Passport passport;

    public Client(String name, String lastName, String bd, Passport passport) {
        this.name = name;
        this.lastName = lastName;
        this.bd = bd;
        this.passport = passport;
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

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bd=" + bd +
                ", passport=" + passport +
                '}';
    }
}
