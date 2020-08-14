package package1;

public class Persone {
   private String name;
   private String lastname;
   private Post post;
    private Animal dog;

    public Persone(String name, String lastname, Post post, Animal dog) {
        this.name = name;
        this.lastname = lastname;
        this.post = post;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Animal getDog() {
        return dog;
    }

    public void setDog(Animal dog) {
        this.dog = dog;
    }
}
