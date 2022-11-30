package example.innerclasses;

/**
 * 内部类与向上转型
 * 将内部类向上转型为其基类, 尤其是一个接口
 * 接口的实现是private内部类, 以这种方式隐藏细节
 */
public class Parcel2 {
    /**
     * private内部类
     */
    private class PContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    /**
     * protected内部类
     */
    protected final class PDestination implements Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        Contents c= p.contents();
        Destination d = p.destination("the lands between");

    }

}
