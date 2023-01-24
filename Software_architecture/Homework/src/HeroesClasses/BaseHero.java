package HeroesClasses;

import HeroInterfaces.HeroInterface;

public abstract class BaseHero implements HeroInterface {
    protected String name;
    protected int attack;
    protected int defence;
    protected int shoot;
    protected float[] damage;
    protected int health;
    protected int crntHeals;
    protected String status;

    @Override
    public void step() {
    }

    @Override
    public String returnCondition() {
        return name +
                " H:" + crntHeals +
                " D:" + defence +
                " A:" + attack +
                " Dmg:" + (int) (Math.abs((damage[0] + damage[1]) / 2)) +
                (shoot > 0 ? " Shots:" + shoot : "") + " " +
                status;
    }

    @Override
    public void setStatus() {
        if (!status.equals("Die")) {
            status = "Alive";
            if (crntHeals < 0) {
                status = "Die";
                crntHeals = 0;
            }
            if (crntHeals > health) crntHeals = health;
        }
    }
}