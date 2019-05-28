public class RomeNumber extends Number {

    private final String [] romeNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};

    // преобразовываем числа к типу int
    public int[] convertToNumbers(String [] substrings) {
        String [] numbersString = substrings;
        String numbersString1 = numbersString[0];
        String numbersString2 = numbersString[1];

        int [] numberArray = new int[2];
        numberArray[0] = convertToArabicNumbers(numbersString1);
        if (numberArray[0] == 0) {
            System.out.println("Incorrect expression");
        }
        numberArray[1] = convertToArabicNumbers(numbersString2);
        if (numberArray[1] == 0) {
            System.out.println("Incorrect expression");
        }
        return numberArray;
    }

    // переводим числа в арабские
    public int convertToArabicNumbers (String s) {

        int romeNumber = 0;
        for (int i = 0; i < romeNumbers.length; i++) {
            if (s.equals(romeNumbers[i])) {
                romeNumber = i + 1;
            }
        }
        return romeNumber;
    }

    // преобразовываем результат в римские числа
    public String convertResultToRome (int result) {

        String romeNumber = "to small result";
        for (int i = 0; i <= romeNumbers.length; i++) {
            if (result == i + 1 ) {
                romeNumber = romeNumbers[i];
            }
        }
        return romeNumber;
    }
}
