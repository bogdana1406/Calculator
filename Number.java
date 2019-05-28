public class Number {
    // принимаемая строка
    private String s;

    // получаем подстроки, содержащие числа
    public String[] getStringNumbers(String s){
        this.s = s;
        String str = s.replaceAll("\\s","");
        System.out.print(str + " = ");
        int indexSing;

        indexSing = getSignIndex(str);

        String substr1 = str.substring(0, indexSing);
        String substr2 = str.substring(indexSing + 1);

        String [] substrings = new String[2];
        substrings[0] = substr1;
        substrings[1] = substr2;

        return substrings;
    }

    // преобразуем подстроки в числа
    public int [] convertToNumbers(String [] substrings) {
        int [] numberArray = new int[2];
        return numberArray;
    }


    //определяем позицию знака операции в строке
    private int getSignIndex(String s) {
        int index = 0;
        char [] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] == '+') || (chars[i] == '-')
                    || (chars[i] == '*') || (chars[i] == '/')) {
                index = i;
                break;
            }
        }
        return index;
    }


    //определяем тип операции
    public byte getOperationType(String s) {
        this.s = s;
        String str = s.replaceAll("\\s","");
//         System.out.println(str);
        int indexSing =  getSignIndex(str);
        String sign = str.substring(indexSing, indexSing + 1);
//        System.out.println(sign);

        byte type = 0;
        if (sign.equals("+")) {
            type = 1;
        }
        if (sign.equals("-")) {
            type = 2;
        }

        if (sign.equals("*")) {
            type = 3;
        }
        if (sign.equals("/")) {
            type = 4;
        }
        return type;
    }

    //выполняем действие
    public int action(int [] numbers, byte type) {
        int result = 0;
        switch (type) {
            case 1:
                result = numbers[0] + numbers[1];
                break;
            case 2:
                result = numbers[0] - numbers[1];
                break;
            case 3:
                result = numbers[0] * numbers[1];
                break;
            case 4:
                try {
                    result = numbers[0] / numbers[1];
                } catch (ArithmeticException e) {
                    System.out.println("you cannot divide to 0");
                    break;
                }
                break;
        }
        return result;
    }
}
