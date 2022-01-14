public class Printer {

    public static String printerError(String s) {
        return s.chars().filter(a -> a > 'm').count() +"/"+ s.chars().count();


    }
}