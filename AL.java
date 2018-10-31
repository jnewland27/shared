import java.util.ArrayList;
import java.util.Formatter;

public class AL{
	public static void main(String args[]){
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int rando = (int)(Math.random()*11);
		int a = 0;
		for(int i = 0; i < rando; i++){
			a = (int)(Math.random()*101);
			nums.add(a);
		}
		
		System.out.println(nums.size());
		System.out.println(nums);
		System.out.println(max(nums));
		System.out.println(sum(nums));
	}

	public static Integer max(ArrayList<Integer> list){
		Integer max = 0;
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) > max){
				max = list.get(i);
			}
		}

		if(max == 0){
			return null;
		}
		return max;
	}

	public static Integer sum(ArrayList<Integer> list){
		Integer sum = 0;
		for(int i = 0; i < list.size(); i++){
				sum = list.get(i) + sum;
		}

		if(sum == 0){
			return null;
		}
		return sum;
	}
}