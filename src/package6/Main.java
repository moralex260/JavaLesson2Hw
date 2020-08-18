package package6;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer>arrayList=new ArrayList<>();
        int i=0;
        while (i!=100){
            Random random=new Random();
            int max=999;
            int min=-999;
            int myValue = random.nextInt(max-min)+min;
          arrayList.add(myValue);
          i++;
        }
        System.out.println(arrayList);
ArrayList newArraylist=new ArrayList();
int k=-1;
        for (int j = 1; j < arrayList.size(); j++) {
k+=3;
if(k>=arrayList.size()){k=k-arrayList.size();}
            System.out.println("кожен 3 елемент"+arrayList.get(k));
if(arrayList.get(k)%2==0) {System.out.println("кожен 3 парний"+arrayList.get(k));
newArraylist.add(arrayList.get(k));
}
        }
        System.out.println(newArraylist);
    }
}
