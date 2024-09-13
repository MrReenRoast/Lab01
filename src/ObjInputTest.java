import java.util.Scanner;

public class ObjInputTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SafeInputObj obj = new SafeInputObj(scanner);
        String nonZero = obj.getNonZeroLenString(scanner, "Enter string: ");
        int rangedInt = obj.getRangedInt(scanner, "Enter int between 1-5: ", 1, 5);
        int integer = obj.getInt(scanner, "Enter integer: ");
        double rangedDouble = obj.getRangedDouble(scanner, "Enter a double between 1-5: ", 1, 5);
        double aDouble = obj.getDouble(scanner, "Enter a double: ");
        System.out.println(nonZero + " " + rangedInt + " " + integer + " " + rangedDouble + " " + aDouble);
    }
}