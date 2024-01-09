package Fabric;

import Interface.iGameItem;
import Product.Bronze;


public class BronzeGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new Bronze();
    }
}
