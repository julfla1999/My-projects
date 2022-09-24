import java.util.Scanner;
public class Colour {

    public static String selectColour() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select colour (B-Blue, G-Green, R-Red, Y-Yellow, P-Purple, W-White)");
            String col = scanner.nextLine().trim().toUpperCase();
            switch (col) {
                case "B": return "Blue";
                case "G": return "Green";
                case "R": return "Red";
                case "Y": return "Yellow";
                case "P": return "Purple";
                case "W": return "White";
                default:
                    System.out.println("We don't have this colour. Choose another.");
            }
        }
    }
}
