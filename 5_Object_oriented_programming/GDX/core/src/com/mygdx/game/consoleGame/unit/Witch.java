package com.mygdx.game.consoleGame.unit;

public class Witch extends Magics{

    public Witch(int x, int y, int number) {
        super(x,y, number);
        super.maxHP = 100;
        super.currentHP = 100;
        super.initiative = 1;
        super.defence = 1;
    }
    @Override
    public String getInfo() {
        return "Witch" + " " + this.name + " " + this.state +" " +  "| ♡ " + this.currentHP + " | ጠ " + this.mana;
    }
}