package behavioural.templateMethod;

public class WoodenHouseBuilder extends AbstractHouseBuilder {

    @Override
    protected void buildFoundation() {
        System.out.println("Wooden house - building foundation");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Wooden house - building walls");
    }

    @Override
    protected void buildDoors() {
        System.out.println("Wooden house - building doors");
    }

    @Override
    protected void buildWindows() {
        System.out.println("Wooden house - building windows");
    }

    @Override
    protected void buildRoof() {
        System.out.println("Wooden house - building roof");
    }
}
