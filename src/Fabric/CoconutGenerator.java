package Fabric;

import Interface.iGameItem;
import Product.Coconut;

public class CoconutGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {

        return new Coconut();
    }
}
