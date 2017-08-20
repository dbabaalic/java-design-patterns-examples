package behavioural.memento;

import java.util.Stack;

public class DashboardCaretaker {

    private Stack<DashboardMemento> dashboardHistory = new Stack<DashboardMemento>();

    public void undo(Dashboard dashboard) { dashboard.undo(dashboardHistory.pop());  }

    public void save(Dashboard dashboard) { dashboardHistory.push(dashboard.save()); }

}
