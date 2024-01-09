package com.mygdx.game.consoleGame.unit;

import java.util.ArrayList;

public class Coordinates{
    protected int x;
    protected int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x: %d, y: %d", x,y);
    }

    public double getDistance(int enemyX, int enemyY){
        return Math.sqrt(Math.pow(enemyX-this.x,2)+Math.pow(enemyY-this.y,2));
    }

    public  int[] coordStep(Coordinates coordP) {

        int[] coordStep = {x,y};
        if(Math.abs(this.x-coordP.x) < Math.abs(this.y-coordP.y)){

            if (coordP.y > this.y) coordStep[1] += 1;
            else coordStep[1] -= 1;
        }
        else {
            if (coordP.x > this.x) coordStep[0] += 1;
            else coordStep[0] -= 1;
        }

        return coordStep;
    }
}
