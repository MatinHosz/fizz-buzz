import java.util.Map;
import java.util.HashMap;

public class Main {
    static Map<Integer, String> baseNumberToCueWord = new HashMap<>();
    public static void main(String[] args) {
        Map<Integer, String> baseNumberToCue = new HashMap<Integer,String>();
        baseNumberToCue.put(3, "Fizz");
        baseNumberToCue.put(5, "Buzz");

        FizzBuzzProcessor fizzBuzzProcessor = new FizzBuzzProcessor(baseNumberToCue);
        for (int i = 1; i <= 100; i++) {
            String result = fizzBuzzProcessor.appendCueIfMultiple(i);
            fizzBuzzProcessor.printResult(i, result);
        }
    }
}


class  FizzBuzzProcessor {
    private Map<Integer, String> baseNumberToCueWord = new HashMap<>();

    public FizzBuzzProcessor(Map<Integer, String> baseNumberToCueWord) {
        this.baseNumberToCueWord = baseNumberToCueWord;
    }

    public String appendCueIfMultiple(int number) {
        StringBuilder output = new StringBuilder();
        baseNumberToCueWord.forEach((baseNumber, cueWord) -> {
        if (number % baseNumber == 0) {
            output.append(cueWord);
        }
        });
        return output.toString();
    }

    public void printResult(int number, String result) {
        if (result.isEmpty()) {
            result = Integer.toString(number);
            System.out.println(result);
        } else {
            System.out.println(result);
        }
    }
}
