package package4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Sinderella> sindarellas= new ArrayList<>();
        int i=0;
        while (i<6){
sindarellas.add(new Sinderella());
            i++;
        }
        System.out.println(sindarellas);
Prince valdemar=new Prince();
valdemar.slipperSize=35;
        for ( Sinderella sindarella : sindarellas) {
            if (sindarella.getFootSize()==valdemar.slipperSize){
                System.out.println(sindarella.getName()+"you will be my wife!");
                break;
            }else {System.out.println("sorry"+sindarella.getName()+",i need run away");}
        }

        }
    }

