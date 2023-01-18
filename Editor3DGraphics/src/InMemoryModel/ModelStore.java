package InMemoryModel;

public abstract class ModelStore implements IModelChangedObserver, IModelChanger {
    public String models;
    public String scenes;
    public String flashes;
    public String cameras;

    public ModelStore(String models, String scenes, String flashes, String cameras) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public String getScenes(int) {
        return scenes;
    }

    public String notifyChange(IModelChanger) {
    }
}
