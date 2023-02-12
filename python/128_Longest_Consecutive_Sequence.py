

def longestConsecutive(nums):
    non_repeated_characters=set(nums)
    max_len=0

    for x in nums:
        if not x-1 in non_repeated_characters:
            curr_len=0
            while x+curr_len in non_repeated_characters:
                curr_len+=1
            
            max_len=max(max_len, curr_len) 
    
    return max_len