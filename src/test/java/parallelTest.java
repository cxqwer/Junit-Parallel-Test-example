import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

import static com.codeborne.selenide.Selenide.*;

@TestMethodOrder(OrderAnnotation.class)
public class parallelTest extends SelenideBase {

    private final static String URL = "https://yandex.ru";
    private int time = 5000;
    static int testNumber = 1;
    private final String locator = ".home-logo__default";

    @Order(1)
    @Test
    public void test1() {
        open(URL);
        $(locator).waitUntil(Condition.visible, time);
        System.out.println(testNumber ++ +" Test finished");
    }

    @Order(2)
    @Test
    public void test2() {
        open(URL);
        $(locator).waitUntil(Condition.visible, time);
        System.out.println(testNumber ++ +" Test finished");
    }

    @Order(3)
    @Test
    public void test3() {
        open(URL);
        $(locator).waitUntil(Condition.visible, time);
        System.out.println(testNumber ++ +" Test finished");
    }

    @Order(4)
    @Test
    public void test4() {
        open(URL);
        $(locator).waitUntil(Condition.visible, time);
        System.out.println(testNumber ++ +" Test finished");
    }

    @Order(5)
    @Test
    public void test5() {
        open(URL);
        $(locator).waitUntil(Condition.visible, time);
        System.out.println(testNumber ++ +" Test finished");
    }

    @Order(6)
    @Test
    public void test6() {
        open(URL);
        $(locator).waitUntil(Condition.visible, time);
        System.out.println(testNumber ++ +" Test finished");
    }
}
