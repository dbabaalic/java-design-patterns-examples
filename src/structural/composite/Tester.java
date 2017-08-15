package structural.composite;

public class Tester implements OrganizationUnit {

    private String name;

    public Tester(String name) {
        this.name = name;
    }

    @Override
    public void displayUnitInformation() {
        System.out.println("Tester : " +name);
    }
}
