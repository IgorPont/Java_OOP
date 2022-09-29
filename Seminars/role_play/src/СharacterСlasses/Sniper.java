package СharacterСlasses;

import java.util.List;

/**
 * Снайпер
 */
public class Sniper extends BaseHero {
    public Sniper(List<BaseHero> side, int x, int y) {
        super(side);
        setName("Снайпер");
        setAttack(12);
        setProtection(10);
        setShots(32);
        setDamage0(8);
        setDamage1(10);
        setHealth(15);
        setSpeed(9);
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
