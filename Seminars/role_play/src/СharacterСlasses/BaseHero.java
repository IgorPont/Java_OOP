package СharacterСlasses;

import HeroInterface.CharacterInterface;

import java.util.List;

/**
 * Абстрактный класс для всех персонажей
 * Реализует все методы интерфейса HeroInterface.CharacterInteraction
 */
public abstract class BaseHero implements CharacterInterface {
    protected String name;
    protected int attack;
    protected int protection;
    protected int shots;
    protected Vector2 damage;
    protected int health;
    protected int crntHealth;
    protected int speed;
    protected boolean shipping;
    protected boolean magic;
    protected String status;
    protected Vector2 position;

    protected List<BaseHero> list;

    protected List<BaseHero> getList() {
        return list;
    }

    public BaseHero(List<BaseHero> side) {
        list = side;
    }

    @Override
    public String returnCondition() {
        return name +
                " Жиз:" + crntHealth +
                " Защ:" + protection +
                " Атк:" + attack +
                " Урн:" + (int) (Math.abs((damage.x + damage.y) / 2)) +
                (shots > 0 ? " Выстрелы:" + shots : "") + " " +
                returnStatus();
    }

    public void changePosition() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Vector2 getPosition() {
        return position;
    }

    protected Vector2 getDistance(List<BaseHero> side) {
        int dist = Integer.MAX_VALUE;
        int out = 0;
        for (BaseHero baseHero : side) {
            float dX = Math.abs(baseHero.position.x - position.x);
            float dY = Math.abs(baseHero.position.y - position.y);
            long tD = Math.round(Math.sqrt(dX * dX + dY * dY));
            if (dist > tD) {
                out = side.indexOf(baseHero);
                dist = (int) tD;
            }
        }
        return new Vector2(out, dist);

    }
}
