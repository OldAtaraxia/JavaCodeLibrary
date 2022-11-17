package designpattern.factory.factory;

import designpattern.factory.buttons.Button;
import designpattern.factory.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
