package structural.composite;

public class ProductOwner implements OrganizationUnit {

    private String name;

    public ProductOwner(String name) {
        this.name = name;
    }

    @Override
    public void displayUnitInformation() {
        System.out.println("Product Owner: "+name);
    }
}
