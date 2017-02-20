import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {

    private static final String DEFAULT_SEPARATOR = ",";
    private List<String> delimiters;

    public Calculator() {
        delimiters = new ArrayList<String>();
        delimiters.add(DEFAULT_SEPARATOR);
    }

    public Calculator(String... separators) {
        delimiters = new ArrayList<String>();
        Collections.addAll(this.delimiters, separators);
    }

    public int add(String numbers) {
        if (numbers.isEmpty())
            return 0;

        return sumNumbers(getNumbers(numbers));
    }

    private int sumNumbers(List<Integer> numbers) {
        int result = 0;
        for(Integer num : numbers)
            result += num;
        return result;
    }

    private List<Integer> getNumbers(String numbers) {
        List<Integer> numbersList = new ArrayList<Integer>();
        String[] stringNumbers = numbers.split(getDelimiters());
        for(String num : stringNumbers) {
            numbersList.add(Integer.valueOf(num));
        }
        return numbersList;
    }

    private String getDelimiters() {
        String delimiters = "";
        for(String delimiter : this.delimiters) {
            delimiters += delimiter;
            if (isNotLastDelimiter(delimiter))
                delimiters += "|";
        }
        return delimiters;
    }

    private boolean isNotLastDelimiter(String delimiter) {
        return delimiters.indexOf(delimiter) < this.delimiters.size() - 1;
    }
}
