import org.junit.jupiter.api.*;

import java.time.Duration;

public class TestSort {

    private static Sort sort; // 排序对象

    @BeforeAll
    public static void setUp() {
        sort = new Sort();
    }

    @DisplayName("正确性测试")
    @Test
    void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        sort.sort(input);
        Assertions.assertArrayEquals(input, expected);
    }

    @DisplayName("Exception测试")
    @Test
    void testException() {
        String[] input = {"i", "have", "an", "egg"};
        Assertions.assertThrows(UnsupportedOperationException.class, sort::superPowerSort);
    }

    @DisplayName("超时测试")
    @Test
    void testTimeOut() {
        // 运行超过一秒会超时
        Assertions.assertTimeout(Duration.ofMillis(1000), () -> Thread.sleep(500));
    }

    @DisplayName("条件测试")
    @Test
    void conditionTest() {
        Assumptions.assumeTrue(sort.a == 1);
        System.out.println("Test 1");
        Assertions.assertEquals(sort.a, 1);
        Assumptions.assumeTrue(sort.b == 2);
        System.out.println("Test 2");
        Assertions.assertEquals(sort.b, 2);
    }

    @Test
    void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        String expected = "an";

        String actual = input[sort.findSmallest(input, 0)];
        Assertions.assertEquals(expected, actual);
    }

}
