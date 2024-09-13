import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SafeInputObjTest {

    SafeInputObj obj1, obj2;
    @BeforeEach
    void setUp() {
        obj1 = new SafeInputObj();
        obj2 = new SafeInputObj();
    }

    @Test
    void getNonZeroLenString() {
        String simulatedInput = "test\n";
        Scanner scanner = new Scanner(simulatedInput);
        SafeInputObj obj = new SafeInputObj(scanner);
        String result = obj.getNonZeroLenString(scanner, "Enter test");
        assertEquals("test", result);
    }

    @Test
    void getRangedInt() {
        String simulatedInput = "5\n";
        Scanner scanner = new Scanner(simulatedInput);
        SafeInputObj obj = new SafeInputObj(scanner);
        int result = obj.getRangedInt(scanner, "Enter 5", 5, 6);
        assertEquals(5, result);
    }

    @Test
    void getInt() {
        String simulatedInput = "6\n";
        Scanner scanner = new Scanner(simulatedInput);
        SafeInputObj obj = new SafeInputObj(scanner);
        int result = obj.getInt(scanner, "Enter 6");
        assertEquals(6, result);
    }

    @Test
    void getRangedDouble() {
        String simulatedInput = "5.5\n";
        Scanner scanner = new Scanner(simulatedInput);
        SafeInputObj obj = new SafeInputObj(scanner);
        double result = obj.getRangedDouble(scanner, "Enter 5.5", 5, 6);
        assertEquals(5.5, result);
    }

    @Test
    void getDouble() {
        String simulatedInput = "6.6\n";
        Scanner scanner = new Scanner(simulatedInput);
        SafeInputObj obj = new SafeInputObj(scanner);
        double result = obj.getDouble(scanner, "Enter 6.6");
        assertEquals(6.6, result);
    }

    @Test
    void getYNConfirm() {
        String simulatedInput = "Y\n";
        Scanner scanner = new Scanner(simulatedInput);
        SafeInputObj obj = new SafeInputObj(scanner);
        boolean result = obj.getYNConfirm(scanner, "Enter Y");
        assertEquals(true, result);
    }

    @Test
    void getRegExString() {
        String simulatedInput = "hello123\n";
        Scanner scanner = new Scanner(simulatedInput);
        SafeInputObj obj = new SafeInputObj(scanner);
        String result = obj.getRegExString(scanner, "Enter hello123", "\\w+");
        assertEquals("hello123", result);
    }
}