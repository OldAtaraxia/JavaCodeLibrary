public class Human {
    int age;
    boolean gender;

    Human() {
        age = 0;
        gender = false;
    }

    Human(int age) {
        gender = true;
        this.age = age;
    }

    Human(boolean gender) {
        this(0);
        this.gender = gender;
    }
}
