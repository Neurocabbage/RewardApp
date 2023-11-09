package Fabric;

import Interface.iGameItem;
import Product.Pineapple;


public class PineappleGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new Pineapple();
    }
}
