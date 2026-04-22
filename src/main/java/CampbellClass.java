class CampbellClass {
    private CampbellClass() {

    }

    public static String convertString(int a) {
        return "" + a;
    }
    public static String convertString(double a) {
        return "" + a;
    }
    public static String convertString(char a) {
        return "" + a;
    }
    public static String convertString(boolean a) {
        return "" + a;
    }

    public static int convertMetersToCenti(int a) {
        return a*100;
    }
    public static double convertMetersToCenti(double a) {
        return a*100;
    }

    public static String removeNonAlpha(String a) {
        return a.replaceAll("[^A-Za-z]+", "");
    }

    public static String removeNonAlpha(String a, boolean b) {
        if (b) {
            a=a.toUpperCase();
        } else {
            a=a.toLowerCase();
        }
        return a.replaceAll("[^A-Za-z]+", "");
    }
}