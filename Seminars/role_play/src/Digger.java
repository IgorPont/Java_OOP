/**
 * Копейщик
 */
public class Digger {
    private String name;
    private int attack;
    private int protection;
    private int shots;
    private int[] damage = new int[2];
    private int health;
    private int speed;
    private boolean shipping;
    private boolean magic;

    public Digger() {
        name = "Копейщик";
        attack = 4;
        protection = 5;
        shots = 0;
        damage[0] = 1;
        damage[1] = 3;
        health = 10;
        speed = 4;
        shipping = false;
        magic = false;
    }

    public Digger(String name) {
        this.name = name;
    }

    public Digger(String name,
                  int attack,
                  int protection,
                  int shots,
                  int[] damage,
                  int health,
                  int speed,
                  boolean shipping,
                  boolean magic) {
        this.name = name;
        this.attack = attack;
        this.protection = protection;
        this.shots = shots;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.shipping = shipping;
        this.magic = magic;
    }

    @Override
    public String toString() {
        return String.format("\nИмя: %s \n" +
                        "Атака: %d \n" +
                        "Защита: %d\n" +
                        "Выстрелы: %d \n" +
                        "Урон: %d-%d \n" +
                        "Здоровье: %d \n" +
                        "Скорость: %d \n" +
                        "Доставка: %s \n" +
                        "Магия: %s \n",
                name,
                attack,
                protection,
                shots,
                damage[0],
                damage[1],
                health,
                speed,
                shipping,
                magic);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public int getProtection() {
        return protection;
    }

    public int getShots() {
        return shots;
    }

    public int[] getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getShipping() {
        return shipping;
    }

    public boolean getMagic() {
        return magic;
    }
}
