package designpattern.factory.factory;

import designpattern.factory.buttons.Button;
import designpattern.factory.buttons.HtmlButtons;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButtons();
    }
}
