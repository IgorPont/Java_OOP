/**
 * Основной класс.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bandit> banditArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            banditArrayList.add(new Bandit());
            banditArrayList.get(i).setName(banditArrayList.get(i).getName() + "_" + (i + 1));
        }

        ArrayList<Crossbowman> crossbowmanArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            crossbowmanArrayList.add(new Crossbowman());
            crossbowmanArrayList.get(i).setName(crossbowmanArrayList.get(i).getName() + "_" + (i + 1));
        }

        ArrayList<Digger> diggerArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            diggerArrayList.add(new Digger());
            diggerArrayList.get(i).setName(diggerArrayList.get(i).getName() + "_" + (i + 1));
        }

        ArrayList<Monk> monkArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            monkArrayList.add(new Monk());
            monkArrayList.get(i).setName(monkArrayList.get(i).getName() + "_" + (i + 1));
        }

        ArrayList<Peasant> peasantArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            peasantArrayList.add(new Peasant());
            peasantArrayList.get(i).setName(peasantArrayList.get(i).getName() + "_" + (i + 1));
        }

        ArrayList<Sniper> sniperArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            sniperArrayList.add(new Sniper());
            sniperArrayList.get(i).setName(sniperArrayList.get(i).getName() + "_" + (i + 1));
        }

        ArrayList<Sorcerer> sorcererArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            sorcererArrayList.add(new Sorcerer());
            sorcererArrayList.get(i).setName(sorcererArrayList.get(i).getName() + "_" + (i + 1));
        }


        System.out.println(banditArrayList);
        System.out.println(crossbowmanArrayList);
        System.out.println(diggerArrayList);
        System.out.println(monkArrayList);
        System.out.println(peasantArrayList);
        System.out.println(sniperArrayList);
        System.out.println(sorcererArrayList);
    }
}

// как правильно разделить классы, интерфейс на папки?