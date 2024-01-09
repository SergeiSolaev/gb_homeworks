package com.mygdx.game.consoleGame.unit;

import java.util.ArrayList;

public interface InGameInterface {
    void step(ArrayList<Base> Owm, ArrayList<Base> Enemy);

    String getInfo();
}


