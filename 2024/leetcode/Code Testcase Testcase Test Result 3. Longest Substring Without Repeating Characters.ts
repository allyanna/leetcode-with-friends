function lengthOfLongestSubstring(s: string): number {
    
   var set = new Set<string>(); 
    var count = 0;
    let left = 0; 

    for(let right = 0; right < s.length; right++) {
        while(set.has(s[right])){
            set.delete(s[left]); 
            left++; 
        }
        set.add(s[right]);
        count = Math.max(count, right - left + 1)
    }
    
    return count;
};
