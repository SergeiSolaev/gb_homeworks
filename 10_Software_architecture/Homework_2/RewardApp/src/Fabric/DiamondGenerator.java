package Fabric;

import Interface.iGameItem;
import Product.Diamond;


public class DiamondGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new Diamond();
    }
}
