package com.mygdx.game.consoleGame.unit;

import java.util.ArrayList;

public abstract class Archers extends Base {
    //protected int shot;
    protected int arrows;
    public Archers(int x, int y, int number) {
        super(x,y, number);
    }
    @Override
    public String getInfo() {
        return null;
    }
    protected void setStatusCountryman(ArrayList<Base> teamOwn){
        for (Base c: teamOwn) {
            if(c.getClass() == Countryman.class && !c.state.equals("Die")
                    && !c.state.equals("Busy")){
                c.state = "Busy";
                this.arrows += 1;
                return;
            }
        }
    }
    @Override
    public void step(ArrayList<Base> teamOwn, ArrayList<Base> teamEnemy) {
        if (this.currentHP <= 0 || this.arrows == 0 ) {return;}
        attack(teamEnemy);
        this.arrows -= 1;
        setStatusCountryman(teamOwn);

    }
}
