package structural.composite;

public class ScrumMaster implements OrganizationUnit {

    private String name;

    public ScrumMaster(String name) {
        this.name = name;
    }

    @Override
    public void displayUnitInformation() {
        System.out.println("Scrum Master: " + name);
    }
}
