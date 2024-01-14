// Using character counts. Long winded version
	public static boolean checkPermutation(String a, String b) {
		
		if(a.length() != b.length()) {
			return false;
		}
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>(); 
		for(int i = 0; i < a.length(); i++) {
			if(map.containsKey(a.charAt(i))) {
				map.put(a.charAt(i), map.get(a.charAt(i)) + 1); 
			}else {
				map.put(a.charAt(i), 1); 
			}
		}
		
		for(int j = 0; j < b.length(); j++) {
			if(!map.containsKey(b.charAt(j))) {
				return false; 
			}
			int count = map.get(b.charAt(j)); 
			if (count == 0) {
				return false; 
			}
			
			map.put(b.charAt(j), map.get(b.charAt(j)) -1);
			
		}
		// This check is redundant with the lenght and checking for zero
		// If we are checking for zero and length we can assume that 
		// the only possibility is for the characters to no be the same. 
		// O(N) space and O(N) time
		for(Integer val: map.values()) {
			if(val != 0) {
				return false;
			}
		}
		return true; 
	}
