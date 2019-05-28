public class ArabicNumber extends Number {
    public int[] convertToNumbers(String [] substrings) {
        String [] numbersString = substrings;
        String numbersString1 = numbersString[0];
        String numbersString2 = numbersString[1];
        int [] numberArray = new int[2];
        try {
            numberArray[0] = Integer.parseInt(numbersString1);
        } catch (Exception e) {
            System.out.println("Bad first number");
        }
        try {
            numberArray[1] = Integer.parseInt(numbersString2);
        } catch (Exception e) {
            System.out.println("Bad second number");
        }
//        numberArray[0] = Integer.parseInt(numbersString1);
//        numberArray[1] = Integer.parseInt(numbersString2);
        return numberArray;
    }
}
