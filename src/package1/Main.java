package package1;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        Persone persone= new Persone("Vasya","Otvertkin",
                new Post("site@com","login","password"),
                new Animal("Sharik",2));
        persone.getPost().tologin("login","password");
        persone.getDog().animalDoThis();
    }
}
