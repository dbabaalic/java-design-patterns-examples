package behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class Dashboard {

    private String name;
    private List<String> widgets = new ArrayList<String>();

    public Dashboard(String name, List<String> widgets) {
        this.name = name;
        this.widgets = widgets;
    }

    public DashboardMemento save() {
        return new DashboardMemento(name, new ArrayList<>(widgets));
    }

    public void undo(DashboardMemento memento) {
        name = memento.getName();
        widgets = memento.getWidgets();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addWidget(String widget) {
        widgets.add(widget);
    }

    @Override
    public String toString() {
        return "Dashboard{" +
                "name='" + name + '\'' +
                ", widgets=" + widgets +
                '}';
    }
}
