package СharacterСlasses;

import java.util.List;

/**
 * Крестьянин
 */
public class Peasant extends BaseHero {
    public Peasant(List<BaseHero> side, int x, int y) {
        super(side);
        setName("Крестьянин");
        setAttack(1);
        setProtection(1);
        setShots(0);
        setDamage0(1);
        setDamage1(1);
        setHealth(1);
        setSpeed(3);
        setShipping(true);
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
