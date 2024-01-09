package com.mygdx.game.consoleGame.unit;

import java.util.ArrayList;
import java.util.Random;

public abstract class Base implements InGameInterface {

    protected String name;
    protected int numberTeam;

    protected int currentHP;
    protected int maxHP;
    public int initiative;
    protected int defence;
    protected String state;
    protected int[] attack;
    protected Coordinates coordinates;

    public Base(int x, int y, int number) {
        this.name = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        this.coordinates = new Coordinates(x, y);
        this.state = "Stand";
        this.numberTeam = number;

    }

    protected void attack(ArrayList<Base> teamEnemy) {
        Base enemy = teamEnemy.get(findNearest(teamEnemy));

//        if((this.attack[1] + this.attack[0]) / 2 - enemy.defence < 0){
//            return;
//        }
        enemy.currentHP -= (this.attack[1] + this.attack[0]) / 2 - enemy.defence;
        if (enemy.currentHP <= 0) {
            enemy.state = "Die";
            enemy.currentHP = 0;
        }
    }

    protected int findNearest(ArrayList<Base> teamEnemy) {

        double minDistance = coordinates.getDistance(teamEnemy.get(0).coordinates.x,
                teamEnemy.get(0).coordinates.y);
        int enemyIndex = 0;
        ArrayList<Base> notDeadTeam = new ArrayList<Base>();
        for (Base p : teamEnemy) {
            if(!p.state.equals("Die")) notDeadTeam.add(p);
        }
        for (int i = 0; i < notDeadTeam.size(); i++) {

                double j = coordinates.getDistance(notDeadTeam.get(i).coordinates.x,
                        notDeadTeam.get(i).coordinates.y);
                if (j < minDistance) {
                    minDistance = j;
                    enemyIndex = i;
                }


        }
        return enemyIndex;
    }

    public int getHp() {
        return this.currentHP;
    }

    public int[] getCoords() {
        int[] coords = new int[]{this.coordinates.x, this.coordinates.y};
        return coords;
    }

    public  boolean die(){
        if(this.state.equals("Die")){
            return true;
        }
        return false;
    }
}
