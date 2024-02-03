import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        // 1) BigDecimal Operations
        System.out.println("\u001b[1m 1) BigDecimal Operations");
        BigDecimal testNum = new BigDecimal("4.2884554224");
        System.out.println("\u001b[0m Input BigDecimal = " + testNum);
        System.out.println("Output roundToHundredth method: " + roundToHundredth(testNum));
        System.out.println("Output negativeRounded method: " + negativeRounded(testNum));

        // 2) Car subclasses tests
        System.out.println("\u001b[1m \n2) Car Inventory System");
        UtilityVehicle car1 = new UtilityVehicle("vinNumber_uv", "Seat_uv", "Ibiza_uv", 20000, true);
        Sedan car2 = new Sedan("vinNumber_sedan", "Seat_sedan", "Ibiza_sedan", 10000);
        Truck car3 = new Truck("vinNumber_truck", "Seat_truck", "Ibiza_truck", 30000, 350000d);
        System.out.println("\u001b[0mCar 1 (utilityvehicle) - " + car1.getInfo());
        System.out.println("\nCar 2 (sedan) - " + car2.getInfo());
        System.out.println("\nCar 3 (truck) - " + car3.getInfo());

        // ¿¿SI EL OBJETO ES DE TIPO UTILITYVEHICLE O TRUCK HAY QUE IMPRIMIR TAMBIEN LAS PROPIEDADES fourWheelDrive y towingCapacity??
    }


    // 1.1) Method returning a double value rounding a BigDecimal to the hundredth
    public static double roundToHundredth (BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }

    // 1.2) Method returning the opposite rounded number to the tenth of a BigDecimal
    public static BigDecimal negativeRounded (BigDecimal number) {
        BigDecimal negativeBigDecimal = new BigDecimal("-1");
        return negativeBigDecimal.multiply(number).setScale(1, RoundingMode.HALF_EVEN);
    }
}