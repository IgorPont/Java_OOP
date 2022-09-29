package СharacterСlasses;

import java.util.List;

/**
 * Разбойник
 */
public class Bandit extends BaseHero {


    public Bandit(List<BaseHero> side, int x, int y) {
        super(side);
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
        setStatus("stand");
        setPosition(new Vector2(x, y));
    }

    @Override
    public boolean returnStatus() {
        return getStatus().equals("active");
    }

    public void changePosition() {

    }
}
