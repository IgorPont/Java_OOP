package СharacterСlasses;

import java.util.List;

/**
 * Арбалетчик
 */
public class Crossbowman extends BaseHero {
    public Crossbowman(List<BaseHero> side, int x, int y) {
        super(side);
        setName("Арбалетчик");
        setAttack(6);
        setProtection(3);
        setShots(16);
        setDamage0(2);
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
