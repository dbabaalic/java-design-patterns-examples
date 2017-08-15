package structural.composite;

public class CompositeDemo {

    public static void main(String[] args) {
        Tribe tribe1 = new Tribe("tribe1");

        Squad squad1 = new Squad("squad1");
        squad1.addUnit(new ProductOwner("Mark"));
        squad1.addUnit(new ScrumMaster("Maja"));
        squad1.addUnit(new Developer("Igor"));
        squad1.addUnit(new Tester("Ivan"));
        tribe1.addUnit(squad1);

        Squad squad2 = new Squad("squad2");
        squad2.addUnit(new ProductOwner("Ben"));
        squad2.addUnit(new ScrumMaster("Natasa"));
        squad2.addUnit(new Developer("Marko"));
        squad2.addUnit(new Tester("Petar"));
        tribe1.addUnit(squad2);

        tribe1.displayUnitInformation();
    }
}
