import Exercises.Medium.ZigzagConversion;

public class Main {
    public static void main(String[] args) {
        // String input = "PAYPALISHIRING";
        String input = "HOLAMUNDO";
        String output = ZigzagConversion.convert(input, 3);

        System.out.println(output);
    }
}