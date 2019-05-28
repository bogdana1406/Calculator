import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] substrings;
        int[] numbers;
        byte type, calculatorType = 0;
        boolean isContinue = true;
        boolean isProgramContinue = true;

        ArabicNumber arabicNumber = new ArabicNumber();
        RomeNumber romeNumber = new RomeNumber();


        while (isProgramContinue) {

            System.out.println("Pleas, input type of calculator:");
            System.out.println("Arabic - 1");
            System.out.println("Rome   - 2");
            System.out.println("(To quit program press q)");

            String chois = sc.nextLine();
            if (chois.equals("q")) {
                isProgramContinue = false;
            } else if (chois.equals("1") || chois.equals("2")){
                isContinue = true;
            calculatorType = Byte.parseByte(chois);
            } else {
                System.out.println("Input is incorrect");
            }

            switch (calculatorType) {
                case 1:
                    while (isContinue) {

                        System.out.println("enter expression from 2 numbers: ");
                        System.out.println("(example: 3 + 5)");
                        String input = sc.nextLine();

                        substrings = arabicNumber.getStringNumbers(input);
                        numbers = arabicNumber.convertToNumbers(substrings);

                        type = arabicNumber.getOperationType(input);

                        int result = arabicNumber.action(numbers, type);
                        System.out.println(result);

                        System.out.println("Press q to choose type of calculator or any key to continue");
                        String exit = sc.nextLine();
                        if (exit.equals("q")) {
                            isContinue = false;
                        }
                    }
                    break;
                case 2:
                    while (isContinue) {
                        System.out.println("enter expression from 2 numbers: ");
                        System.out.println("(example: V - III)");
                        String input = sc.nextLine();
                        substrings = romeNumber.getStringNumbers(input);
                        numbers = romeNumber.convertToNumbers(substrings);

                        type = romeNumber.getOperationType(input);
                        int result = romeNumber.action(numbers, type);
                        String romeResult = romeNumber.convertResultToRome(result);
                        System.out.println(romeResult);

                        System.out.println("Press q to choose type of calculator or any key to continue");
                        String exit = sc.nextLine();
                        if (exit.equals("q")) {
                            isContinue = false;
                        }
                    }
                    break;

                default:
                    System.out.println("bad choise");

            }

            }
        }
    }

