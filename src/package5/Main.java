package package5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        int arr[]={2,17,13,6,22,31,45,66,100,-18};
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }
        System.out.println(arrayList);
        int i=0;

        while (i!=arrayList.size()){

            System.out.println(arrayList.get(i));
            i++;
            }
        System.out.println("парний індекс");
        for (int j = 0; j < arrayList.size(); j++) {
            if(j%2==0)
            System.out.println(arrayList.get(j));

        }
        System.out.println("////////////////////////////////////////////////////// парні числа");
        for (Integer integer : arrayList) {
            if(integer % 2 == 0)
            System.out.println(integer);
        }

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\непарні числа");
        for (Iterator<Integer> it = arrayList.iterator(); it.hasNext(); ) {
            Integer inter = it.next();
            if(inter%2!=0) System.out.println(inter);;
        }
        System.out.println("----------------------------------------------------------------------------------------");
        arrayList.stream().forEach(var -> System.out.println(var));
        System.out.println("_____________________________________________________________________________________________");
        arrayList.forEach(Main::printItemList);
        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
        arrayList.forEach(var -> printItemList(var));
        System.out.println("у зворотньому порядку");
        ListIterator<Integer> lit =  arrayList.listIterator(arrayList.size());
        while (lit.hasPrevious())  {
            Integer inter = lit.previous();
             System.out.println(inter);
        }

        }

    private static void printItemList(Integer integer) {
        System.out.println(integer);
    }

}

