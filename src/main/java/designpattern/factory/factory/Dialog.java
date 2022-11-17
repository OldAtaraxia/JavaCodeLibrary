package designpattern.factory.factory;


import designpattern.factory.buttons.Button;

/**
 * Base factory class
 */
public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    /**
     * 由子类重写, 创建指定类型的Button
     * @return 创建的Button
     */
    public abstract Button createButton();

}
