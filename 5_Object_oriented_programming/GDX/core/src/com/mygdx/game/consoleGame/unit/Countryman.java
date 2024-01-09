package com.mygdx.game.consoleGame.unit;

import java.util.ArrayList;

public class Countryman extends Base{

    public Countryman(int x, int y, int number) {
        super(x,y, number);
        super.maxHP = 100;
        super.currentHP = 100;
        super.initiative = 2;
        super.state = "Stand";
    }
    @Override
    public String getInfo() {
        return "Countryman" + " " + this.name + " " + this.state +" " + "| ♡ " + this.currentHP;
    }

    @Override
    public void step(ArrayList<Base> Owm, ArrayList<Base> Enemy) {
        if(this.currentHP > 0){this.state = "Stand";}

    }
}
