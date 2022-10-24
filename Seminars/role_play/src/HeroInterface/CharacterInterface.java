/**
 * Интерфейс
 * Описание методов взаимодействия классов (персонажей)
 */

package HeroInterface;

import СharacterСlasses.BaseHero;
import СharacterСlasses.Vector2;

import java.util.List;

public interface CharacterInterface {

    /**
     * Вернуть статус
     */
    void setStatus();

    /**
     * Переместиться
     */
    void step(List<BaseHero> side);

    /**
     * Вернуть состояние
     */
    String returnCondition();

    /**
     * Вернуть имя
     */
    String getName();

    /**
     * Вернуть позицию на поле
     */
    Vector2 getPosition();

}


