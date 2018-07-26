package codes.showme.jenkinsbook.domain;

import org.junit.Ignore;

import static org.junit.Assert.*;

public class UserTest {

    @org.junit.Test
    public void getFullName() {

        User user = new User();
        user.setFirstName("John");
        user.setLastName("Wayne");
        assertEquals("John Wayne", user.getFullName());

    }



    @Ignore
    @org.junit.Test
    public void getFullName1() {

        User user = new User();
        user.setFirstName("abc");
        user.setLastName("Wayne");
        assertEquals("John", user.getFullName());

    }
}