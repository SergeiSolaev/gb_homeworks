import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.*;

public class App {
    public static void main(String[] args) throws Exception {

       Random random = ThreadLocalRandom.current();

       List<ItemGenerator> fabrics = initFabrics();

        for (int i = 0; i < 200; i++) {
            int index = random.nextInt(fabrics.size());
            fabrics.get(index).openReward();
        }
    }

    public static  List<ItemGenerator> initFabrics() {


        List<ItemGenerator> generators = new ArrayList<>();

        generators.add(new GemGenerator());
        for (int i = 0; i < 3; i++) {
            generators.add(new GoldGenerator());
        }
        for (int i = 0; i < 10; i++) {
            generators.add(new BronzeGenerator());
            generators.add(new DiamondGenerator());
            generators.add(new EmeraldGenerator());
            generators.add(new RubyGenerator());
            generators.add(new PlatinumGenerator());
        }

        return generators;
    }
}
