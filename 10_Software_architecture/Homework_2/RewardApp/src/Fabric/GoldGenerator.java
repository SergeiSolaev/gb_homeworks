package Fabric;

import Interface.iGameItem;
import Product.Gold;

public class GoldGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Gold();
    }
    
}
