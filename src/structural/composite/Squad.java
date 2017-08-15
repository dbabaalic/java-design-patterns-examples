package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Squad implements OrganizationUnit {

    private String name;
    private List<OrganizationUnit> units = new ArrayList<>();

    public Squad(String name) {
        this.name = name;
    }

    @Override
    public void displayUnitInformation() {
        System.out.println("Squad: "+ name);
        System.out.println("---------------------");
        for(OrganizationUnit unit : units){
            unit.displayUnitInformation();
        }
        System.out.println("---------------------");
    }
    public void addUnit(OrganizationUnit unit) {
        units.add(unit);
    }

}
