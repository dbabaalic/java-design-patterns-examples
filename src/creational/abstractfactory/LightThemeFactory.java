package creational.abstractfactory;

public class LightThemeFactory implements ThemeFactory {

    @Override
    public Button getButton() {
        return new LightButton();
    }

    @Override
    public Dialog getDialog() {
        return new LightDialog();
    }
}
