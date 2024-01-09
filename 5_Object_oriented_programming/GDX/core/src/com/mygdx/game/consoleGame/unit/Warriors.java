package com.mygdx.game.consoleGame.unit;

import java.util.ArrayList;

public abstract class Warriors extends Base {

    public Warriors(int x, int y, int number) {
        super(x, y, number);
    }

    @Override
    public void step(ArrayList<Base> Own, ArrayList<Base> Enemy) {
        if (this.currentHP == 0) {return;}
        int k = findNearest(Enemy);

        int[] coordStep = coordinates.coordStep(Enemy.get(k).coordinates);
        for (int i = 0; i < Own.size(); i++){
            if (Own.get(i).coordinates.x == coordStep[0] && Own.get(i).coordinates.y == coordStep[1]) {
                return;
            }
        }
        if (Enemy.get(k).coordinates.x == coordStep[0] && Enemy.get(k).coordinates.y == coordStep[1]) {
            Enemy.get(k).currentHP -= (this.attack[1] + this.attack[0]) / 2 - Enemy.get(k).defence;
            Enemy.get(k).state = "UnderAttack";
            if (Enemy.get(k).currentHP <= 0) {
                Enemy.get(k).state = "Die";
                Enemy.get(k).currentHP = 0;
            }
            return;
        }

        this.coordinates.x = coordStep[0];
        this.coordinates.y = coordStep[1];

    }
}