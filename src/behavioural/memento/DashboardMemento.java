package behavioural.memento;

import java.util.List;

public class DashboardMemento {

    private String name;
    private List<String> widgets;

    public DashboardMemento(String name, List<String> widgets) {
        this.name = name;
        this.widgets = widgets;
    }

    public String getName() {
        return name;
    }

    public List<String> getWidgets() {
        return widgets;
    }
}
