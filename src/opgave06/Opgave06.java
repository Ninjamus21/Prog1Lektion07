package opgave06;

public class Opgave06 {
    public static void main(String[] args) {
        char[] romanNumber = {'M','M','I','V'}; //2025
        System.out.println(romanNumberToArabicNumber(romanNumber));
    }

    private static int romanNumberToArabicNumber(char[] romanNumber) {
        int sum = 0;
        for (int index = 0; index < romanNumber.length; index++) {
            int value = SingleRomanNumberToArabicNumber(romanNumber[index]);

            // logikken for både plus og minus
            if (index + 1 < romanNumber.length) {
                int nextValue = SingleRomanNumberToArabicNumber(romanNumber[index + 1]);
                if (value < nextValue){
                    sum -= value;
                } else {
                    sum += value;
                }
            } else {
                sum += value;
            }

        }
        return sum;
    }

    private static int SingleRomanNumberToArabicNumber(char roman) {
        return switch (roman) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException(roman + " is not a valid roman number literal.");
        };
    }

}
