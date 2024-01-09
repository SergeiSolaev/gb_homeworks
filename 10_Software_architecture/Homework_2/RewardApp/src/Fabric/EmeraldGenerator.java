package Fabric;

import Interface.iGameItem;
import Product.Emerald;


public class EmeraldGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem()  {
        return new Emerald();
    }
}
