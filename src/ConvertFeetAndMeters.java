/*
 * Richard Martinez
 * Date 8/27/2023
 * Chapter 6 Assignment 6.9 Conversions between Feet and Meters
 * Program converts feet and meters into the opposite and displays results in a table
 * using the two methods footToMeter and meterToFoot
 */
public class ConvertFeetAndMeters {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    } 

    public static double footToMeter(double foot){
        // Create the constant for feet in meter
        final double FEET_IN_METER = 0.305;
        // Convert feet to meters
        double conversion = foot * FEET_IN_METER;
        // Return conversion
        return conversion;
    }

    public static double meterToFoot(double meter){
        meter += 5;
        return meter;
    }


}
