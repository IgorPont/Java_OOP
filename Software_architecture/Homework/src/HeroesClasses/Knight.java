package HeroesClasses;

public class Knight extends BaseHero {
    public Knight() {
        name = ("Knight");
        attack = 4;
        defence = 5;
        shoot = 0;
        damage = new float[]{2, 3};
        crntHeals = health = 25;
        status = "Alive";
    }

    @Override
    public void step(){

    }
}
