package СharacterСlasses;

import java.util.List;
import java.util.Random;

/**
 * Колдун
 */
public class Wizard extends BaseHero {
    public Wizard(List<BaseHero> side, int x, int y) {
        super(side);
        name = "Колдун";
        attack = 17;
        protection = 12;
        shots = 0;
        damage = new Vector2(-5, -5);
        crntHealth = health = 30;
        speed = 9;
        shipping = false;
        magic = true;
        status = "ожидает";
        position = new Vector2(x, y);
    }

    @Override
    public boolean returnStatus() {
        return status.equals("жив");
    }

    @Override
    public void changePosition() {
        int i = new Random().nextInt(super.list.size());
        BaseHero p = super.list.get(i);
        if (!p.status.equals("мертв")){
            p.crntHealth -= damage.x;
            if (p.crntHealth >= p.health){
                p.crntHealth = p.health;
            }
        }
    }
}
