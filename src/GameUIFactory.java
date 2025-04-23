
public interface GameUIFactory {
    Button createButton();
    Dialog createDialog();
}

class NormalGameUIFactory implements GameUIFactory {
    public Button createButton() {
        return new NormalButton();
    }

    public Dialog createDialog() {
        return new NormalDialog();
    }
}

class AdvancedGameUIFactory implements GameUIFactory {
    public Button createButton() {
        return new AdvancedButton();
    }

    public Dialog createDialog() {
        return new AdvancedDialog();
    }
}

class NormalButton implements Button {
    public void render() {
        System.out.println("Rendering Normal Button");
    }
}

class NormalDialog implements Dialog {
    public void display() {
        System.out.println("Displaying Normal Dialog");
    }
}

class AdvancedButton implements Button {
    public void render() {
        System.out.println("Rendering Advanced Button");
    }
}

class AdvancedDialog implements Dialog {
    public void display() {
        System.out.println("Displaying Advanced Dialog");
    }
}
