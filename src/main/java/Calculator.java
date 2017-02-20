import java.util.ArrayList;
import java.util.List;

public class Calculator {

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
        String[] stringNumbers = numbers.split(",");
        for(String num : stringNumbers) {
            numbersList.add(Integer.valueOf(num));
        }
        return numbersList;
    }
}
