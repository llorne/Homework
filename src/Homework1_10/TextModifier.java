package Homework1_10;

public class TextModifier {
    public static String[] reverseLines(String[] lines) {
        String[] reversedLines = new String[lines.length];
        for (int i = 0; i < lines.length; i++) {
            reversedLines[i] = new StringBuilder(lines[i]).reverse().toString();
        }
        return reversedLines;
    }
}
