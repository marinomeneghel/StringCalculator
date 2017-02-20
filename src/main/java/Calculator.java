/**
 * Created by marino on 2/20/17.
 */
public class Calculator {

    public int add(String numbers) {
        if (numbers.isEmpty())
            return 0;
        String nums[] = numbers.split(",");

        int result = 0;
        for(int i=0; i<nums.length; i++) {
            result += Integer.valueOf(nums[i]);
        }
        return result;
    }
}
