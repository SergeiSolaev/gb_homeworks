package com.mygdx.game.consoleGame.unit;

public class Pikerman extends Warriors{

    public Pikerman(int x, int y, int number) {
        super(x,y, number);
        super.maxHP = 150;
        super.currentHP = 150;
        super.initiative = 4;
        super.defence = 10;
        super.attack = new int[]{20, 40};
    }
    @Override
    public String getInfo() {
        return "Pikerman" + " " + this.name + " " + this.state +" " +  "| ♡ " + this.currentHP   +
                "| x " +this.coordinates.x + " y " + this.coordinates.y;
    }
}
