package behavioural.templateMethod;

public class ConcreteHouseBuilder extends AbstractHouseBuilder {

    @Override
    protected void buildFoundation() {
        System.out.println("Concreate house - building foundation");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Concreate house - building walls");
    }

    @Override
    protected void buildDoors() {
        System.out.println("Concreate house - building doors");
    }

    @Override
    protected void buildWindows() {
        System.out.println("Concreate house - building windows");
    }

    @Override
    protected void buildRoof() {
        System.out.println("Concreate house - building roof");
    }
}
