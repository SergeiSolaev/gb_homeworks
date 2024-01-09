package com.mygdx.game.consoleGame.unit;

import java.util.ArrayList;

public class Monk extends Magics {


    public Monk(int x, int y, int number) {
        super(x,y, number);
        super.maxHP = 100;
        super.currentHP = 100;
        super.initiative = 1;
        super.defence = 2;
    }
    @Override
    public String getInfo() {
        return "Monk" + " " + this.name + " " + this.state +" " +  "| ♡ " + this.currentHP + " | ጠ " + this.mana;
    }

}
