package lesson5;

public class HW5 {
    public static void main(String[] args) {
        System.out.println("Код валюты: " + getCurrency("доллар"));
        System.out.println("Number of letter: " + getLetterOfNumber('P'));
        System.out.println("Максимвльное значение: " + getNumber(128) );
    }

    public static String getCurrency(String d) {
        return switch (d) {
            case "йены" -> "JPY";
            case "фунт" -> "GBP ";
            case "доллар" -> "USD";
            case "евро" -> "EUR";
            case "тугрик" -> "MNT";
            default -> "нет такой валюты";
        };
    }

    public static int getLetterOfNumber(int number) {
        return switch (number) {
            case 'A', 'B', 'C' -> 2;
            case 'D', 'E', 'F' -> 3;
            case 'G', 'H', 'I' -> 4;
            case 'J', 'K', 'L' -> 5;
            case 'M', 'N', 'O' -> 6;
            case 'P', 'Q', 'R', 'S' -> 7;
            case 'T', 'U', 'V' -> 8;
            case 'W', 'X', 'Y', 'Z' -> 9;
            default -> 1;
        };
    }

    public static int getNumber(int t) {
        int b = t / 100;
        int c = (t / 10 - b * 10);
        int d = (t - (b * 100 + c * 10));
        int max = b > c ? b : c;
        int max1 = c > d ? c : d;
        return max1;


    }
}
