import java.util.List;
import java.util.Arrays;

public class WeightedAverage {
	public static double mean(List<Integer> numbers, List<Integer> weights) {
		int total = 0;
		int totalWeights = 0;
		if (numbers == null || weights==null) {
       	 throw new NullPointerException("Null Value occur in arguments");
        }
		else if(numbers.size()!=weights.size()) {
			throw new IllegalArgumentException("Same Size Required for given arguments");
		}
		for (int i = 0; i < numbers.size(); i++) {
			total += numbers.get(i) * weights.get(i);
			totalWeights += weights.get(i);
		}
         /*if (total<0||total>24) {
        	 throw new IllegalArgumentException(Integer.toString(total));
         }*/
		return total / totalWeights;
	}

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(new Integer[] { 3, 6 });
		List<Integer> b = Arrays.asList(new Integer[] { 5, 3 });

		 if (WeightedAverage.mean(a, b)<0||WeightedAverage.mean(a, b)>1000) {
        	 throw new IllegalArgumentException("Wrong Anwer");
         }
		
		System.out.println(WeightedAverage.mean(a, b));
	}
}