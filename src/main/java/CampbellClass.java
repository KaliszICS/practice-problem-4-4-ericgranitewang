/**
 * epic utility class (very useful)
 * @author Eric Wang
 */

public class CampbellClass {
    private CampbellClass() {

    }
    /**
     * converts an int to a string
     * @param a integer to convert
     * @return returns a as a string
     */
    public static String convertString(int a) {
        return "" + a;
    }
    /**
     * converts a double to a string
     * @param a double to convert
     * @return returns a as a string
     */
    public static String convertString(double a) {
        return "" + a;
    }
    /**
     * converts a char to a string
     * @param a char to convert
     * @return returns a as a string
     */
    public static String convertString(char a) {
        return "" + a;
    }
    /**
     * converts a boolean to a string
     * @param a boolean to convert
     * @return returns a as a string
     */
    public static String convertString(boolean a) {
        return "" + a;
    }
    /**
     * converts int meters to int centimeters
     * @param a integer to convert
     * @return returns a as an integer in cm
     */
    public static int convertMetersToCenti(int a) {
        return a*100;
    }
    /**
     * converts double meters to double centimeters
     * @param a double to convert
     * @return returns a in double cm
     */
    public static double convertMetersToCenti(double a) {
        return a*100;
    }
    /**
     * removes all non alpha characters from a string
     * @param a the string to remove characters from
     * @return the string with all nonalpha characters removed
     */
    public static String removeNonAlpha(String a) {
        return a.replaceAll("[^A-Za-z]+", "");
    }
    /**
     * removes all non alpha characters from the string
     * also accepts a boolean input to convert to upper/lowercase
     * @param a String to modify
     * @param b boolean, if true, convert a to uppercase, otherwise lowercase
     * @return returns the resulting string after case conversion and character removals
     */
    public static String removeNonAlpha(String a, boolean b) {
        if (b) {
            a=a.toUpperCase();
        } else {
            a=a.toLowerCase();
        }
        return a.replaceAll("[^A-Za-z]+", "");
    }
}