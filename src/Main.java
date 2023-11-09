import Fabric.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        List<ItemGenerator> generators = new ArrayList<>();

        // Добавление генераторов в список
        for (int i = 0; i < 10; i++) {
            generators.add(new SilverGenerator());
            generators.add(new BananaGenerator());
            generators.add(new CarrotGenerator());
            generators.add(new CoconutGenerator());
            generators.add(new PineappleGenerator());
        }

        for (int i = 0; i < 3; i++) {
            generators.add(new GoldGenerator());
        }

        generators.add(new GemGenerator());

        // Генерация награды
        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(generators.size());
            ItemGenerator generator = generators.get(index);
            generator.openReward();
        }


    }
}