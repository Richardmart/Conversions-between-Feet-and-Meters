/*
 * Richard Martinez
 * Date 8/27/2023
 * Chapter 6 Assignment 6.9 Conversions between Feet and Meters
 * Program converts feet and meters into the opposite and displays results in a table
 * using the two methods footToMeter and meterToFoot
 */
public class ConvertFeetAndMeters {
    public static void main(String[] args) {
        // Create starting values for feet and meters to be converted
        // Starting value for feet is 1.0
        double startingFeet = 1.0;
        // Starting value for meters is 20.0
        double startingMeters = 20.0;
        // Setup up table headers
        String tableHeader = "Feet \t Meters  | \t Meters  Feet";
        System.out.println(tableHeader);
        // Create loop to output values for table 
        while ((startingFeet <= 10.0) && (startingMeters <= 65.0)){
            // Convert the values to their respective measurements
            double feetToMeters = footToMeter(startingFeet);
            double metersToFeet = meterToFoot(startingMeters);
            // Output values back out into table
            System.out.println(startingFeet + "\t " + feetToMeters + "\t | \t " + startingMeters + "\t " + metersToFeet);
            // Increment starting feet and meters values
            startingFeet += 1.0;
            startingMeters += 5.0;
        }
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
