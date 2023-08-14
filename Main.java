package HW2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        ItemFabric generator = new GoldGenerator();
        generator.openReward();
        generator = new SilverGenerator();
        generator.openReward();
        generator = new DiamondGenerator();
        generator.openReward();

        Random rnd = ThreadLocalRandom.current();
        List<ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new GoldGenerator());
        fabricList.add(new SilverGenerator());
        fabricList.add(new DiamondGenerator());

        for (int i = 0; i < 20; i++) {
            int num = Math.abs(rnd.nextInt(3));
            ItemFabric fabric = fabricList.get(num);
            fabric.openReward();
        }
    }
}