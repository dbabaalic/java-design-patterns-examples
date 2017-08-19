package behavioural.templateMethod;

public class TemplateMethodDemo {

    public static void main(String[] args) {

        AbstractHouseBuilder woodenBuilder = new WoodenHouseBuilder();
        woodenBuilder.build();

        System.out.println("---------------------------------");

        AbstractHouseBuilder concreteBuilder = new ConcreteHouseBuilder();
        concreteBuilder.build();

    }
}
