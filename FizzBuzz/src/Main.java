public class Main {
    static String output = "";

    public static void main(String[] args) {

        final int baseNumber_1 = 3;
        final int baseNumber_2 = 5;
        final int baseNumber_3 = 7;

        for (int i = 1; i <= 100; i++) {
            appendCueIfMultiple(baseNumber_1, i, "Fizz");
            appendCueIfMultiple(baseNumber_2, i, "Buzz");
            appendCueIfMultiple(baseNumber_3, i, "Choz");

            printOutput(i);
        }

    }

    private static void appendCueIfMultiple(int baseNumber, int number, String cueWord) {
        if (number % baseNumber == 0) {
            output += cueWord;
        }
    }

    private static void printOutput(int number) {
        if (output.isEmpty()) {
            output = Integer.toString(number);
            System.out.println(output);
        } else {
            System.out.println(output);
        }
        output = "";
    }
}
