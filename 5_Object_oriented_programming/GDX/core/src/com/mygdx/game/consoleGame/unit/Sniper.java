package com.mygdx.game.consoleGame.unit;

public class Sniper extends Archers{

    public Sniper(int x, int y, int number) {
        super(x,y, number);
        super.maxHP = 100;
        super.currentHP = 100;
        super.arrows = 10;
        super.initiative = 9;
        super.defence = 3;
        super.attack = new int[]{15, 30};
    }

    @Override
    public String getInfo() {
        return "Sniper" + " " + this.name + " " + this.state +" " + "| ♡ " + this.currentHP + " | ➶ " + this.arrows;
    }

}
