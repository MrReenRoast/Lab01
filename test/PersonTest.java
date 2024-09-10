import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PersonTest {

    Person p1, p2, p3, p4;
    @BeforeEach
    void setUp() {
        p1 = new Person("000001", "Ryan", "Rofe", "Mr.", 2002);
        p2 = new Person("000002", "Carina", "Dison", "Ms.", 2003);
        p3 = new Person("000003", "Tom", "Wulf", "Mr.", 1958);
        p4 = new Person("000004", "Jerry", "Seinfeld", "Mr.", 1954);
    }


    @Test
    void setID() {
        p1.setID("000001");
        assertEquals(p1.getID(), "000001");
    }

    @Test
    void setFirstName() {
        p1.setFirstName("Ryan");
        assertEquals(p1.getFirstName(), "Ryan");
    }

    @Test
    void setLastName() {
        p1.setLastName("Rofe");
        assertEquals(p1.getLastName(), "Rofe");
    }

    @Test
    void setTitle() {
        p1.setTitle("Mr.");
        assertEquals(p1.getTitle(), "Mr.");
    }

    @Test
    void setYOB() {
        p1.setYOB(2002);
        assertEquals(p1.getYOB(), 2002);
    }

    @Test
    void fullName() {
        assertEquals(p1.fullName(), "Ryan Rofe");
    }

    @Test
    void formalName() {
        assertEquals(p1.formalName(), "Mr. Ryan Rofe");
    }

    @Test
    void getAge() {
        assertEquals(p1.getAge(), "22");
    }
}