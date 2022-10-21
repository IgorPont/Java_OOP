package СharacterСlasses;

import java.util.List;

/**
 * Снайпер
 */
public class Sniper extends BaseHero {
    public Sniper(List<BaseHero> side, int x, int y) {
        super(side);
        name = "Снайпер";
        attack = 12;
        protection = 10;
        shots = 32;
        damage = new Vector2(8, 10);
        crntHealth = health = 15;
        speed = 9;
        shipping = false;
        magic = false;
        status = "ожидает";
        position = new Vector2(x, y);
    }

    @Override
    public boolean returnStatus() {
        return status.equals("жив");
    }

    @Override
    public void changePosition() {
        boolean tmp = false;
        for(BaseHero bh: super.list){
            if(bh.name.equals(("Крестьянин")) &&
                    !bh.status.equals("мертв")) tmp = true;
            if (tmp) shots++;
        }
    }
}
