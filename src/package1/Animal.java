package package1;

public class Animal {
  private   String nickname;
   private int age;
    Animal(String nickname, int age){
        this.nickname=nickname;
        this.age=age;

    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "nickname=" + nickname +age +" age " ;
    }
     void animalDoThis(){
        int a=( int)(Math.random()*10);
        if(a<=4){
            System.out.println("wov wow");
        }
        else if(a>4 & a<=9){
            System.out.println("pis pis");
        }
        else System.out.printf("ou,please,you "+this.getNickname()+"\n" +
                    "pissed on the keyboard");
    }

}
