package ModelEliments;

import java.util.List;

import Stuff.Type;

public class Scene {
    public int id;
    public List<PoligonModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id, List<PoligonModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;

        if (models.size() > 0) {
            this.models = models;
        } else {
            throw new Exception("Должна быть одна модель");
        }

        this.flashes = flashes;

        if (cameras.size() > 0) {
            this.cameras = cameras;
        } else {
            throw new Exception("Должна быть одна камера");
        }
    }

    // /**
    // * заглушка
    // */
    // public Type method1(Type t) {
    // return null;
    // }

    // /**
    // * заглушка
    // */
    // public Type method2(Type t1, Type t2) {
    // return null;
    // }

    public <T> T method1(T flash) {
        return flash;
    }

    public <T, E> T method2(T Model, E Flash) {
        return Model;
    }
}