package СharacterСlasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Монах
 */
public class Monk extends BaseHero {
    public Monk(List<BaseHero> side, int x, int y) {
        super(side);
        name = "Монах";
        attack = 12;
        protection = 7;
        shots = 0;
        damage = new Vector2(-4, -4);
        crntHealth = health = 30;
        speed = 5;
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
