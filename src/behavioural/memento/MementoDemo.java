package behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class MementoDemo {

    public static void main(String[] args) {

        List<String> widgets = new ArrayList<String>();
        widgets.add("Products by price");
        widgets.add("Profit per year");
        Dashboard dashboard = new Dashboard("My Dashboard", widgets);

        DashboardCaretaker dashboardCaretaker = new DashboardCaretaker();

        dashboardCaretaker.save(dashboard);
        System.out.println("Dashboard before change");
        System.out.println(dashboard);

        dashboard.addWidget("Loss per year");
        System.out.println("Dashboard after change");
        System.out.println(dashboard);

        dashboardCaretaker.undo(dashboard);
        System.out.println("Dashboard after undo");
        System.out.println(dashboard);


    }
}
