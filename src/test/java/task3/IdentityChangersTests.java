package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IdentityChangersTests {

    @Test
    void testChangeIdentity() {
        //Given
        Person p1 = new Person("Test 1", 21);
        Person p2 = new Person("Name 2", 45);
        IdentityChanger identityChanger = new IdentityChanger();

        //When
        identityChanger.changeIdentity(p1, p2);

        //Then
        assertAll(() -> assertEquals("Name 2", p1.getName()),
                () -> assertEquals(45, p1.getAge()),
                () -> assertEquals("Test 1", p2.getName()),
                () -> assertEquals(21, p2.getAge()));
    }
}
