package com.mygdx.game.consoleGame;

import com.mygdx.game.consoleGame.unit.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;


public class Main {
    public ArrayList<Base> team = new ArrayList<>();
    public ArrayList<Base> teamOne = new ArrayList<>();
    public ArrayList<Base> teamTwo = new ArrayList<>();
    public Main(){

    }
    @SuppressWarnings("NewApi")
    public void main() {

        int numberTeam = 1;

        createTeam(teamOne, numberTeam);
        numberTeam++;
        createTeam(teamTwo, numberTeam);
        numberTeam++;
        team.addAll(teamOne);
        team.addAll(teamTwo);
        team.sort(Comparator.comparingInt((Base c) -> c.initiative));

        System.out.println("TeamOne:");
        getTeamInfo(teamOne);
        System.out.println("TeamTwo:");
        getTeamInfo(teamTwo);


        int i= 1;

//        while (true){

//            View.view();
//            i++;
//            if (teamDie(teamOne)){
//                System.out.println();
//                System.out.println(AnsiColors.ANSI_BLUE+"\tBlue side WIN"+AnsiColors.ANSI_RESET);
//                break;
//            }
//            if (teamDie(teamTwo)){
//                System.out.println(AnsiColors.ANSI_GREEN+"\tGreen side WIN"+AnsiColors.ANSI_RESET);
//                break;
//            }
//        }

    }

    public boolean run(){
        for (Base c: team) {
            if (teamOne.contains(c)){
                c.step(teamOne, teamTwo);
            }
            else {
                c.step(teamTwo, teamOne);
            }
        }
        return !teamDie(teamOne) & !teamDie(teamTwo);
    }

    public static void createTeam(ArrayList<Base> teamList, int numberTeam){
        int teamCount = 10;
        int coordinateY;
        int coordinateX = 1;
        Random rand = new Random();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(4);
            if (numberTeam%2 != 0){
                coordinateY = 1;
            }
            else {
                coordinateY = 10;
            }
            if (numberTeam%2 != 0){

                switch (val) {
                    case 0:
                        teamList.add(new Arbalester(coordinateX,coordinateY, numberTeam));
                        break;
                    case 1:
                        teamList.add(new Monk(coordinateX,coordinateY, numberTeam));
                        break;
                    case 2:
                        teamList.add(new Pikerman(coordinateX,coordinateY, numberTeam));
                        break;
                    case 3:
                        teamList.add(new Countryman(coordinateX,coordinateY,numberTeam));
                        break;
                    default:
                        break;
                }

            }
            else {
                switch (val) {
                    case 0:
                        teamList.add(new Sniper(coordinateX,coordinateY, numberTeam));
                        break;
                    case 1:
                        teamList.add(new Witch(coordinateX,coordinateY, numberTeam));
                        break;
                    case 2:
                        teamList.add(new Robber(coordinateX,coordinateY, numberTeam));
                        break;
                    case 3:
                        teamList.add(new Countryman(coordinateX,coordinateY,numberTeam));
                        break;
                    default:
                        break;
                }

            }
            coordinateX++;
        }
    }
    public static void getTeamInfo(List<Base> teamList){
        for (Base base : teamList) {
            System.out.println(base.getInfo());
        }
        System.out.println("===============================================");
    }

    public static boolean teamDie(ArrayList<Base> team){
        boolean state = false;
        for (Base c: team) {
            if(!c.die())
                return false;
        }
        return true;

    }

}

//        System.out.println("TeamOne:");
//        getTeamInfo(teamOne);
//        System.out.println("TeamTwo:");
//        getTeamInfo(teamTwo);