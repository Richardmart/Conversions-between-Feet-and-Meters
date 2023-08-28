/*
 * Richard Martinez
 * Date 8/27/2023
 * Chapter 6 Assignment 6.9 Conversions between Feet and Meters
 * Program converts feet and meters into the opposite and displays results in a table
 * using the two methods footToMeter and meterToFoot
 */
public class ConvertFeetAndMeters {
    public static void main(String[] args) {
        double testNumber = 10.0;
        double convertedNumber = footToMeter(testNumber);
        // System.out.format("%.2f", convertedNumber);
        System.out.printf("%.3f\n", convertedNumber);
        double newConvertedNumber = meterToFoot(testNumber);
        // System.out.format("%.2f", newConvertedNumber);
        System.out.printf("%.3f\n", newConvertedNumber);

    } 

    public static double footToMeter(double foot) {
        // Create the constant for feet in meter
        final double FEET_IN_METER = 0.305;
        // Convert feet to meters
        double conversion = foot * FEET_IN_METER;
        // Return conversion
        return conversion;
    }

    public static double meterToFoot(double meter) {
        // Create the constant for meter in feet
        final double METER_IN_FEET = 3.279;
        // Convert meters to feet
        double conversion = meter * METER_IN_FEET;
        // Return conversion
        return conversion;
    }


}
