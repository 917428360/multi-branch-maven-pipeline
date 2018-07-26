package codes.showme.jenkinsbook.controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestControllerTest {

    @Test
    public void test1() {
        TestController testController = new TestController();
        assertEquals("test", testController.test());
    }
}