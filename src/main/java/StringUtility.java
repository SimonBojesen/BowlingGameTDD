public class StringUtility {
    private static StringBuilder sb;
    public  String reverseString(String toBeReversed) {
        if (toBeReversed== null) return "";
        sb = new StringBuilder(toBeReversed);
        return sb.reverse().toString();
    }

    public String capitalizeString(String toBeCapitalized) {
        if (toBeCapitalized == null) return "";
        return toBeCapitalized.toUpperCase();
    }

    public String lowercaseString(String toBeLowerCased) {
        if (toBeLowerCased == null) return "";
        return toBeLowerCased.toLowerCase();
    }
}
