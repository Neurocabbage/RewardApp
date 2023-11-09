package Fabric;

import Interface.iGameItem;
import Product.Carrot;

public class CarrotGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new Carrot();
    }
}
