package structural.composite;

public class Developer implements OrganizationUnit {

    private String name;

    public Developer(String name){
        this.name = name;
    }

    @Override
    public void displayUnitInformation() {
        System.out.println("Developer: "+name);
    }
}
