package HeroInterface; /**
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
    String returnCondition(); // возвращает состояние (здоровье, атака и тд)

}


