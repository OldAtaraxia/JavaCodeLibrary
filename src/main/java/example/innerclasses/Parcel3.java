package example.innerclasses;

/**
 * 局部内部类
 */
public class Parcel3 {
    public Destination destination(String s) {
        final class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination("the lands between");
    }

}
