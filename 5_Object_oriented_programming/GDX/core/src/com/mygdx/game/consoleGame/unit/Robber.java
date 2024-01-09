package com.mygdx.game.consoleGame.unit;

public class Robber extends Warriors{
    public Robber(int x, int y, int number) {
        super(x,y, number);
        super.maxHP = 100;
        super.currentHP = 100;
        super.initiative = 5;
        super.defence = 10;
        super.attack = new int[]{30, 50};

    }
    @Override
    public String getInfo() {
        return "Robber" + " " + this.name + " " + this.state +" " +  "| ♡ " + this.currentHP +
                "| x " +this.coordinates.x + " y " + this.coordinates.y;
    }
}
