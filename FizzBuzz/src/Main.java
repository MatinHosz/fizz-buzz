public class Main {
    static String output = "";

    public static void main(String[] args) {

        final int baseNumber_1 = 3;
        final int baseNumber_2 = 5;
        final int baseNumber_3 = 7;

        

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
