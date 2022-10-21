package СharacterСlasses;

import java.util.List;

/**
 * Копейщик
 */
public class Digger extends BaseHero {

    public Digger(List<BaseHero> side, int x, int y) {
        super(side);
        name = "Копейщик";
        attack = 4;
        protection = 5;
        shots = 0;
        damage = new Vector2(1,3);
        crntHealth = health = 10;
        speed = 4;
        shipping = false;
        magic = false;
        status = "ожидает";
        position = new Vector2(x, y);
    }

    @Override
    public boolean returnStatus() {
        return status.equals("жив");
    }

    public void changePosition() {

    }
}
