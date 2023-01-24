package HeroesClasses;

public class Archer extends BaseHero {
    public Archer() {
        name = ("Archer");
        attack = 8;
        defence = 3;
        shoot = 8;
        damage = new float[] {2, 4};
        crntHeals = health = 20;
        status = "Alive";
    }

    @Override
    public void step(){

    }
}
