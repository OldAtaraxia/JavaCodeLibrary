package designpattern.factory;

import designpattern.factory.factory.Dialog;
import designpattern.factory.factory.HtmlDialog;
import designpattern.factory.factory.WindowsDialog;

import java.awt.*;

/**
 * 用户客户端
 */
public class Client {
    private static Dialog dialog;

    /**
     * 根据一些条件来判断具体用哪种工厂
     */
    static void config() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * 不关心具体使用了哪种工厂,直接使用其产品即可
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }

    public static void main(String[] args) {
        config();
        runBusinessLogic();
    }
}
