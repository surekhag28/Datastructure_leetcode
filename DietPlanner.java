
public class DietPlanner {

	public static int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        
		int points=0;
		int window_sum=0;
		
		if(calories.length==0)
			return 0;
			
		
		for(int i=0;i<k;i++) {
			window_sum+=calories[i];
		}
		
		if(window_sum>upper)
			points++;
		else if(window_sum<lower)
			points--;
		
		for(int i=k;i<calories.length;i++) {
			window_sum+=calories[i]-calories[i-k];
			if(window_sum>upper)
				points++;
			else if(window_sum<lower)
				points--;
		}
		System.out.println(points);
		return points;
    }

	public static void main(String[] args) {

		int[] calories = {1} ;
		int k = 1, lower = 3, upper = 3;
		dietPlanPerformance(calories,k,lower,upper);
	}

}
