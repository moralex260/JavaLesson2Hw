package package1;

public class Post {
    private String site;
   private String login;
   private String password;

    public Post(String site, String login, String password) {
        this.site = site;
        this.login = login;
        this.password = password;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    void tologin(String login, String password){
        if (login.equals(this.login) & password.equals(this.password)) {
            System.out.println("you are logged in ");
        }else {
            System.out.println("Something went wrong");
        }
    }

}
