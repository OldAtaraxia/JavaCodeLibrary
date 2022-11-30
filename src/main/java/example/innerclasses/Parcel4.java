package example.innerclasses;

/**
 * 匿名内部类, 是对Contents接口的实现
 */
public class Parcel4 {
    public int value = 10;

    public Contents contents() {
        return new Contents() {
            private int i = value;

            @Override
            public int value() {
                i++;
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Contents c = new Parcel4().contents();
        System.out.println(c.value());
    }
}
