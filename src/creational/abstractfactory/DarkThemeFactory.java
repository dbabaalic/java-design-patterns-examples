package creational.abstractfactory;

public class DarkThemeFactory implements ThemeFactory {

    @Override
    public Button getButton() {
        return new DarkButton();
    }

    @Override
    public Dialog getDialog() {
        return new DarkDialog();
    }
}
