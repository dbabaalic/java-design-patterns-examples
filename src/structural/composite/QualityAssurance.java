package structural.composite;

public class QualityAssurance implements OrganizationUnit {

    private String name;

    public QualityAssurance(String name) {
        this.name = name;
    }

    @Override
    public void displayUnitInformation() {
        System.out.println("QualityAssurance: " +name);
    }
}
