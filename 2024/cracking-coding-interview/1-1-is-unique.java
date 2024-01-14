	public static boolean isUnique(String s) {
		
		if (s == null) {
			return true;
		}
		
		Set<Character> set = new HashSet<Character>(); 
		char [] vals = s.toCharArray();
		
		for(int i = 0; i < vals.length; i++) {
			if(set.contains(vals[i])) {
				return false;
			}else {
				set.add(vals[i]);
			}
		}
		return true;
	}
	
	/*
	 * Check the check and how on earth this makes sense? */
	public static boolean isUniqueNoSpace(String str) {
		int checker = 0; 
		for(int i = 0; i <str.length(); i++) {
			int val = str.charAt(i) - 'a'; 
			if((checker & (1 << val)) > 0) {
				return false; 
			}
		}
		return true;
	}
