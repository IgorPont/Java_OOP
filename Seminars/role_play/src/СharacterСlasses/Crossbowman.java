package СharacterСlasses;

import java.util.List;

/**
 * Арбалетчик
 */
public class Crossbowman extends BaseHero {
    public Crossbowman(List<BaseHero> side, int x, int y) {
        super(side);
        name = "Арбалетчик";
        attack = 6;
        protection = 3;
        shots = 16;
        damage = new Vector2(2,3);
        health = 10;
        speed = 4;
        shipping = false;
        magic = false;
        status = "ожидает";
        position = new Vector2(x, y);
    }

    @Override
    public boolean returnStatus() {
        return status.equals("active");
    }
    public void changePosition() {

    }
}
