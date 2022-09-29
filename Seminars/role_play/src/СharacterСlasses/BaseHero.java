package СharacterСlasses;

import HeroInterface.CharacterInterface;

import java.util.List;

/**
 * Абстрактный класс для всех персонажей
 * Реализует все методы интерфейса HeroInterface.CharacterInteraction
 */
public abstract class BaseHero implements CharacterInterface {
    private String name;
    private int attack;
    private int protection;
    private int shots;
    private int[] damage = new int[2];
    private int health;
    private int crntHeals;
    private int speed;
    private boolean shipping;
    private boolean magic;
    private String status;

    private Vector2 position;

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

    public int getCrntHeals(){
        return crntHeals;
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

    public String getStatus() {
        return status;
    }

    public  Vector2 getPosition(){
        return position;
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

    public void setCrntHeals(int crntHeals){
        this.crntHeals = crntHeals;
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

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPosition(Vector2 position){
        this.position = position;
    }

    protected List<BaseHero> list;

    protected List<BaseHero> getList(){
        return list;
    }

    public BaseHero(List<BaseHero> side){
        list = side;
    }

    @Override
    public String returnCondition() {
        return name + " Ж:" + health + " З:" + protection + " А:" + attack + " " + status;
    }
}
