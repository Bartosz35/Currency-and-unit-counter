import java.util.Scanner;
/**
 This class converts between two units.
 */
public class UnitsOfLengthConverter {

    public UnitsOfLengthConverter(String fromUnit) {
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Convert from:");
        String fromUnit = in.nextLine();
        System.out.println("Convert to: ");
        String toUnit = in.nextLine();

        UnitsOfLengthConverter from = new UnitsOfLengthConverter(fromUnit);
        UnitsOfLengthConverter to = new UnitsOfLengthConverter(toUnit);
        System.out.println("Value:");
        double val = in.nextDouble();
        double meters = from.toMeters(val);
        double converted = to.fromMeters(meters);
        System.out.println(val + " " + fromUnit + " = " + converted + " " + toUnit);
    }

    private double toMeters(double val) {
    }

    private double fromMeters(double meters) {
    }


}