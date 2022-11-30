package example.innerclasses;

/**
 * 手动创建内部类
 */
public class DotNew {
    public class Inner {}

    public static void main(String[] args) {
        DotNew dn = new DotNew(); // 首先创建对应的外部类
        DotNew.Inner dni = dn.new Inner();
    }
}
