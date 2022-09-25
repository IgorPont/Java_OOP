/**
 * Абстрактный класс для всех персонажей
 * Реализует все методы интерфейса CharacterInteraction
 */
public class BaseHero implements CharacterInteraction {
    private String name;
    private int attack;
    private int protection;
    private int shots;
    private int[] damage = new int[2];
    private int health;
    private int speed;
    private boolean shipping;
    private boolean magic;
    private boolean status;

    public BaseHero() {
    }

    public BaseHero(String name) {
        this.name = name;
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
                        "Магия: %s \n" +
                        "Статус: %s \n",
                name,
                attack,
                protection,
                shots,
                damage[0],
                damage[1],
                health,
                speed,
                shipping,
                magic,
                status);
    }

    public String getName() {
        return name;
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

    public int getSpeed() {
        return speed;
    }

    public boolean getShipping() {
        return shipping;
    }

    public boolean getMagic() {
        return magic;
    }

    public boolean getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public void setDamage0(int damage) {
        this.damage[0] = damage;
    }

    public void setDamage1(int damage) {
        this.damage[1] = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setShipping(boolean shipping) {
        this.shipping = shipping;
    }

    public void setMagic(boolean magic) {
        this.magic = magic;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void hit() {
    }

    @Override
    public float getHit(float damage) {
        return 0;
    }

    @Override
    public boolean returnStatus() {
        return false;
    }

    @Override
    public boolean changePosition() {
        return false;
    }

    @Override
    public String returnCondition() {
        return null;
    }
}
