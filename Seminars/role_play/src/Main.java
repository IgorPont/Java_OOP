import СharacterСlasses.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Игра
 */

public class Main {
    public static void main(String[] args) {
        List<BaseHero> darkSide = new ArrayList<>();
        List<BaseHero> witeSide = new ArrayList<>();

        darkSide.add(new Peasant(darkSide, 0, 0));
        darkSide.add(new Bandit(darkSide, 0, 0));
        darkSide.add(new Sniper(darkSide, 0, 0));
        darkSide.add(new Sorcerer(darkSide, 0, 0));
        Random rnd = new Random();
        for (int i = 0; i < 6; i++) {
            switch (rnd.nextInt(4)) {
                case 0:
                    darkSide.add(new Peasant(darkSide, 0, 0));
                    break;
                case 1:
                    darkSide.add(new Bandit(darkSide, 0, 0));
                    break;
                case 2:
                    darkSide.add(new Sniper(darkSide, 0, 0));
                    break;
                default:
                    darkSide.add(new Sorcerer(darkSide, 0, 0));
                    break;
            }
        }

        witeSide.add(new Peasant(witeSide, 0, 0));
        witeSide.add(new Digger(witeSide, 0, 0));
        witeSide.add(new Crossbowman(witeSide, 0, 0));
        witeSide.add(new Monk(witeSide, 0, 0));
        for (int i = 0; i < 6; i++) {
            switch (rnd.nextInt(4)) {
                case 0:
                    witeSide.add(new Peasant(witeSide, 0, 0));
                    break;
                case 1:
                    witeSide.add(new Digger(witeSide, 0, 0));
                    break;
                case 2:
                    witeSide.add(new Crossbowman(witeSide, 0, 0));
                    break;
                default:
                    witeSide.add(new Monk(witeSide, 0, 0));
                    break;
            }
        }

        System.out.println("\nБитва началась!");
        System.out.println("\n*****\n");
        System.out.println("Темная сторона\t\t\t\t\t\t\t\tБелая сторона\n");
        for (int i = 0; i < darkSide.size(); i++) {
            if (darkSide.get(i).returnCondition().length() > 35) {
                System.out.println(darkSide.get(i).returnCondition() + "\t:\t" + witeSide.get(i).returnCondition());
            } else {
                System.out.println(darkSide.get(i).returnCondition() + "\t\t:\t" + witeSide.get(i).returnCondition());
            }
        }
        System.out.println("\nСледующий ход - введите: ход\nЗакончить игру - введите: выход");

        Scanner in = new Scanner(System.in);
        int step = 1;
        String txt = "";
        while (!txt.equals("выход")) {
            txt = in.nextLine();
            if (txt.equals("ход")) {
                System.out.println("\nХод: " + Integer.toString(step));
                System.out.println("*****\n");
                System.out.println("Темная сторона\t\t\t\t\t\t\t\tБелая сторона");
                for (int i = 0; i < darkSide.size(); i++) {
                    darkSide.get(i).changePosition();
                    witeSide.get(i).changePosition();
                    if (darkSide.get(i).returnCondition().length() > 35) {
                        System.out.println(darkSide.get(i).returnCondition() + "\t:\t" +
                                witeSide.get(i).returnCondition());
                    } else {
                        System.out.println(darkSide.get(i).returnCondition() + "\t\t:\t" +
                                witeSide.get(i).returnCondition());
                    }
                }
                System.out.println("\nСледующий ход - введите: ход\n" +
                        "Закончить игру - введите: выход");
                step++;
            }
        }
        System.out.println("Игра окончена.");
        System.exit(0);
    }
}