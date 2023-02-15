package ru.corruptzero.firsttask;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Fail.fail;

@SpringBootTest
class FirstTaskApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testAddition() {
        int x = 2;
        int y = 3;
        int result = x + y;
        if (result != 5) {
            fail("Addition of " + x + " and " + y + " should equal 5, but was " + result);
        }
    }


}
