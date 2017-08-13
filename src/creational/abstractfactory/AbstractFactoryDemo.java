package creational.abstractfactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {

        ThemeFactory themeFactory = AbstractThemeFactory.getThemeFactory("dark");

        Button button = themeFactory.getButton();
        Dialog dialog = themeFactory.getDialog();

        button.draw();
        dialog.draw();

    }


}
