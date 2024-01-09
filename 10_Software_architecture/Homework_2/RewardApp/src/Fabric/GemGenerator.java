package Fabric;

import Interface.iGameItem;
import Product.Gem;

public class GemGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Gem();
    }
    
}
