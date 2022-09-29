package СharacterСlasses;

import java.util.List;

/**
 * Колдун
 */
public class Sorcerer extends BaseHero {
    public Sorcerer(List<BaseHero> side, int x, int y) {
        super(side);
        setName("Колдун");
        setAttack(17);
        setProtection(12);
        setShots(0);
        setDamage0(-5);
        setDamage1(-5);
        setHealth(30);
        setSpeed(9);
        setShipping(false);
        setMagic(true);
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
