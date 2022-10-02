package СharacterСlasses;

import java.util.List;

/**
 * Крестьянин
 */
public class Peasant extends BaseHero {
    public Peasant(List<BaseHero> side, int x, int y) {
        super(side);
        name = "Крестьянин";
        attack = 1;
        protection = 1;
        shots = 0;
        damage = new Vector2(1,1);
        health = 1;
        speed = 3;
        shipping = true;
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
