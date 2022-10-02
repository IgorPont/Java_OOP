package СharacterСlasses;

import java.util.List;
import java.util.Random;

/**
 * Колдун
 */
public class Sorcerer extends BaseHero {
    public Sorcerer(List<BaseHero> side, int x, int y) {
        super(side);
        name = "Колдун";
        attack = 17;
        protection = 12;
        shots = 0;
        damage = new Vector2(-5, -5);
        health = 30;
        speed = 9;
        shipping = false;
        magic = true;
        status = "ожидает";
        position = new Vector2(x, y);
    }

    @Override
    public boolean returnStatus() {
        return status.equals("active");
    }

    public void changePosition() {
        Random rnd = new Random();
        int temp = list.indexOf(list.get(rnd.nextInt(list.size())));
        list.get(temp).health -= damage.x;

    }
}
