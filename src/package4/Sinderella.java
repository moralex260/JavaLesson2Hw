package package4;

import java.util.Random;

public class Sinderella {
   private String name;
   private int age;
   private double footSize;

    public Sinderella() {
        this.name = randomName();
        this.age = randomAge();
        this.footSize = randomSize();
    }
 String randomName(){
   String arr1[]={"B" ,"C" ,"D","F", "G",
           "H", "J" ,"K", "L" ,"M", "N","P",
           "Q" ,"R" ,"S",
           "T"  ,"V",
           "W","X", "Y" , "Z"};
   String arr2[]={"A","E","I","O","U","Y"};
   String name="";

    for (int i = 0; i < (int)(2+Math.random()*7); i++) {
        Random random= new Random();
        name=name+ arr1[random.nextInt(arr1.length)];
        name=name+ arr2[random.nextInt(arr2.length)];
    }
        return name;
}
 int randomAge(){
    int min = 16;
    int max = 50;
    int diff = max - min;
    Random random = new Random();
    int i = random.nextInt(diff + 1);
    i += min;
    return i;
}

double randomSize(){
    int min = 34;
   int max = 44;
    int diff = max - min;
    Random random = new Random();
    int i = random.nextInt(diff + 1);
    i += min;
    return i;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getFootSize() {
        return footSize;
    }

    public void setFootSize(double footSize) {
        this.footSize = footSize;
    }

    @Override
    public String toString() {
        return "Sinderella{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", footSize=" + footSize +
                '}';
    }
}
