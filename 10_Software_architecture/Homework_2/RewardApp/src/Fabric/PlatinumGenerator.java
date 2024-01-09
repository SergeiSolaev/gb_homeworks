package Fabric;

import Interface.iGameItem;
import Product.Platinum;

public class PlatinumGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new Platinum();
    }
}
