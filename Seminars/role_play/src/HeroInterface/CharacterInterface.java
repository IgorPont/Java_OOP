package HeroInterface;

import СharacterСlasses.Vector2;

/**
 * Интерфейс
 * Описание методов взаимодействия классов (персонажей)
 */

public interface CharacterInterface {

    /**
     * Вернуть статус
     */
    boolean returnStatus();

    /**
     * Переместиться
     */
    void changePosition();

    /**
     * Вернуть состояние
     */
    String returnCondition();

    /**
     *
     * Вернуть имя
     */
    String getName();

    /**
     * Вернуть позицию на поле
     */
    Vector2 getPosition();

}


