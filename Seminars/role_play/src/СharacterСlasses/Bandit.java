package СharacterСlasses;

/**
 * Разбойник
 */
public class Bandit extends BaseHero {


    public Bandit() {
        setName("Разбойник");
        setAttack(8);
        setProtection(3);
        setShots(0);
        setDamage0(2);
        setDamage1(4);
        setHealth(10);
        setSpeed(6);
        setShipping(false);
        setMagic(false);
        setStatus(true);
    }
//    переопределяем работу метода родительского класса
//    @Override
//    public int getAttack() {
//        return super.getAttack();
//    }
}
