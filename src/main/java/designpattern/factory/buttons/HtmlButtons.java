package designpattern.factory.buttons;

/**
* HTML Button implements
* */
public class HtmlButtons implements Button{
    @Override
    public void render() {
        System.out.println("<button>Test</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("click!");
    }
}
