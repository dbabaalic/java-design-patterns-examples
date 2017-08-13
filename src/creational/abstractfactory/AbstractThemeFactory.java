package creational.abstractfactory;

public class AbstractThemeFactory {

    public static ThemeFactory getThemeFactory(String type) {

        ThemeFactory themeFactory = null;
        switch (type) {
            case "light":
                themeFactory = new LightThemeFactory();
                break;
            case "dark":
                themeFactory = new DarkThemeFactory();
                break;
        }
        return themeFactory;
    }
}