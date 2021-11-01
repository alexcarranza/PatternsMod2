package patterns.creational.factoryMethod.button;

public abstract class Dialog {
    public void render() {
        Button okButton = createButton();
        okButton.onClick("close");
        okButton.render();
    }

    public abstract Button createButton();
}
