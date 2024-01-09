package com.mygdx.game.consoleGame.unit;
import java.util.ArrayList;

public class Magics extends Base{
        protected int mana;
        protected int hill;
    public static int count = 1;
        public Magics(int x, int y, int number) {
            super(x,y, number);
            this.mana = 100;
            this.hill = 5;
            super.attack =new int[]{10, 20};
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public void step(ArrayList<Base> Owm, ArrayList<Base> Enemy) {
            if (this.state.equals("Die")) {return;}
            if (this.mana > 0){
                boolean hillTarget = false;
                int hillTargetIndex = 0;
                int recievedDamage = (Owm.get(0).maxHP - Owm.get(0).currentHP);

                for (int i = 0; i < Owm.size(); i++) {
                    if ((Owm.get(i).maxHP - Owm.get(i).currentHP) > recievedDamage && !Owm.get(i).state.equals("Die")){
                        recievedDamage = Owm.get(i).maxHP - Owm.get(i).currentHP;
                        hillTargetIndex = i;
                    }
                }
                if (recievedDamage < 150 && recievedDamage > 0){hillTarget = true;}
                if (hillTarget && !Owm.get(hillTargetIndex).state.equals("Die")){
                    Owm.get(hillTargetIndex).currentHP += this.hill;
                    if (Owm.get(hillTargetIndex).currentHP > Owm.get(hillTargetIndex).maxHP){
                        Owm.get(hillTargetIndex).currentHP = Owm.get(hillTargetIndex).maxHP;
                    }
                    //Owm.get(hillTargetIndex).state = "Healed";
                }

                else {
                    for (Base c : Enemy) {
                        if (!c.state.equals("Die")) {
                            c.currentHP -= (this.attack[0] + this.attack[1]) / 2;
                            //c.state = "Magic_attack";
                            if (c.currentHP <= 0) {
                                c.state = "Die";
                                c.currentHP = 0;
                            }
                            return;

                        }
                    }
                }
                this.mana -= 5;
            }
            else this.mana +=5;
    }
}
