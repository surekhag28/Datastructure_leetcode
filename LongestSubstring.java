import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LongestSubstring {

	public static int lengthOfLongestSubstringTwoDistinct(String s) {
        
		int max=Integer.MIN_VALUE;
		
		int left=0,right=0;
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		if(s.length()==0)
			return 0;
		while(right<s.length()) {
			map.put(s.charAt(right),map.getOrDefault(s.charAt(right), 0)+1);
			right++;
			
			
			if(map.size()>2) {
				while(left<=right) {
					if(map.get(s.charAt(left))==1)
						map.remove(s.charAt(left));
					else
						map.put(s.charAt(left), map.get(s.charAt(left))-1);
					left++;
					
					if(map.size()>2)
						continue;
					else
						break;
					
				}
			}
			
			max = Math.max(max, right-left);
			
		}
		
		return max;
    }
	
	public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        
		int max=1;
		
		int left=0,right=0;
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		while(right<s.length()) {
			Character ch = s.charAt(right);
			if(map.containsKey(ch)) {
				map.remove(ch);
			}
			map.put(ch, right++);
			
			if(map.size()>k) {
				Map.Entry<Character, Integer> leftMostEntry = map.entrySet().iterator().next();
				map.remove(leftMostEntry.getKey());
				left = leftMostEntry.getValue()+1;
			}
			
			max = Math.max(max,right-left);
		}
		return max;
    }
	
	public static void putElements() {
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		map.put('e', 0);
		map.put('c', 1);
		map.put('e', 2);
		
		System.out.println(map);
	}
	
	public static void addElements() {
		List<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(0,2);
		list.add(0,3);
		
		System.out.println(list);
	}
	public static void main(String[] args) {

		String s = "ccaabbb";
		int k=2;
		System.out.println(lengthOfLongestSubstringTwoDistinct(s));
		System.out.println(lengthOfLongestSubstringKDistinct(s,k));
		putElements();
		addElements();
	}

}
