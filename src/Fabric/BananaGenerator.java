package Fabric;

import Interface.iGameItem;
import Product.Banana;

public class BananaGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new Banana();
    }
}
