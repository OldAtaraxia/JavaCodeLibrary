package example.innerclasses;

/**
 * 创建内部类
 */
public class Parcel {
    static class Contents {
        private int i = 1;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readlabel() {
            return label;
        }
    }

    /**
     * 使用内部类: 与使用外部类完全相同
     */
    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readlabel());
    }

    /**
     * 返回内部类的引用
     */
    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public static void main(String[] args) {
        Parcel p = new Parcel();
        p.ship("The lands between");
    }
}
