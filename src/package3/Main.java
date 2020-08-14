package package3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
Request firstRequest= new Request(1,new Date(),"ЗАПРОС",new Client("Vasya","Otvertkin","06/06/1966",
        new Passport("KA",1234567890,"xz")));

        System.out.println(firstRequest);
    }

}
