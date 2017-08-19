package behavioural.templateMethod;

public abstract class AbstractHouseBuilder {

    protected abstract void buildFoundation();
    protected abstract void buildWalls();
    protected abstract void buildDoors();
    protected abstract void buildWindows();
    protected abstract void buildRoof();

    public final void build() {
        buildFoundation();
        buildWalls();
        buildDoors();
        buildWindows();
        buildRoof();
    }
}
