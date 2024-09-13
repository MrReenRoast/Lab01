import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ProductTest {

    Product p1, p2;
    @BeforeEach
    void setUp() {
        p1 = new Product("000001", "Bread", "For eating", 1.00);
        p2 = new Product("000002", "Milk", "For drinking", 2.00);
    }

    @Test
    void setName() {
        p1.setName("Bread");
        assertEquals("Bread", p1.getName());
    }

    @Test
    void setDescription() {
        p1.setDescription("For eating");
        assertEquals("For eating", p1.getDescription());
    }

    @Test
    void setID() {
        p1.setID("000001");
        assertEquals("000001", p1.getID());
    }

    @Test
    void setCost() {
        p1.setCost(1.00);
        assertEquals(1.00, p1.getCost());
    }
}