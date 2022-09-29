package СharacterСlasses;

import java.util.List;

/**
 * Копейщик
 */
public class Digger extends BaseHero {

    public Digger(List<BaseHero> side, int x, int y) {
        super(side);
        setName("Копейщик");
        setAttack(4);
        setProtection(5);
        setShots(0);
        setDamage0(1);
        setDamage1(3);
        setHealth(10);
        setSpeed(4);
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
