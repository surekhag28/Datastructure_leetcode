
public class PermutationString {

	public static boolean checkInclusion(String s1, String s2) {
        
		int k=s1.length();
		
		if(s1.length()>s2.length())
			return false;
		
		
		int[] s1Map= new int[26];
		int[] s2Map = new int[26];
		
		for(int i=0;i<k;i++) {
			s1Map[s1.charAt(i)-'a']++;
			s2Map[s2.charAt(i)-'a']++;
		}
		
		for(int i=k;i<s2.length();i++) {
			if(matches(s1Map,s2Map))
				return true;
			s2Map[s2.charAt(i)-'a']++;
			s2Map[s2.charAt(i-k)-'a']--;
		}
		return false;
    }
	
	public static boolean matches(int[] s1Map,int[] s2Map) {
		for(int i=0;i<s1Map.length;i++) {
			if(s1Map[i]!=s2Map[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s1="ab";
		String s2 = "eidbaooo";
		System.out.println(checkInclusion(s1,s2));
	}
}
