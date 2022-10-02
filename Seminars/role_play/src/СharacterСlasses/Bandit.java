package СharacterСlasses;

import java.util.List;

/**
 * Разбойник
 */
public class Bandit extends BaseHero {


    public Bandit(List<BaseHero> side, int x, int y) {
        super(side);
        name = "Разбойник";
        attack = 8;
        protection = 3;
        shots = 0;
        damage = new Vector2(2,4);
        health = 10;
        speed = 6;
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
