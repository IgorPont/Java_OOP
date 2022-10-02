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
    protected int speed;
    protected boolean shipping;
    protected boolean magic;
    protected String status;
    protected Vector2 position;

    protected List<BaseHero> list;
    protected List<BaseHero> getList(){
        return list;
    }
    public BaseHero(List<BaseHero> side){
        list = side;
    }
    @Override
    public String returnCondition() {
        return name + " Жиз:" + health + " Защ:" + protection + " Атк:" + attack + " " + status;
    }
}
