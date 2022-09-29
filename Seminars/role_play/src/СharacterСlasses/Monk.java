package СharacterСlasses;

import java.util.List;

/**
 * Монах
 */
public class Monk extends BaseHero {
    public Monk(List<BaseHero> side, int x, int y) {
        super(side);
        setName("Монах");
        setAttack(12);
        setProtection(7);
        setShots(0);
        setDamage0(-4);
        setDamage1(-4);
        setHealth(30);
        setSpeed(5);
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
