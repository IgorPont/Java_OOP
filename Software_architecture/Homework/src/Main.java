/*
Реализовать следующие классы героев:
1. Лучник
2. Рыцарь
Сделать между ними батл
Сделать для лучника 2 вида луков
Сдeлать для рыцаря 2 вида мечей
Сделать 2 класса лёгкой брони
Сделать 2 класса лат
 */

import HeroesClasses.Archer;
import HeroesClasses.Knight;

public class Main {
    public static void main(String[] args) {
        Archer archer = new Archer();
        Knight knight = new Knight();

        System.out.println(archer.returnCondition());
        System.out.println(knight.returnCondition());


    }
}
