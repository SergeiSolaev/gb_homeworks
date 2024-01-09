package ModelEliments;

import java.util.ArrayList;
import java.util.List;

public class PoligonModel {
    public List<Poligon> poligons;
    public List<Texture> textures;
    public PoligonModel(List<Texture> textures) {
        this.textures = textures;
        this.poligons = new ArrayList<>();
        this.poligons.add(new Poligon());
    }
}