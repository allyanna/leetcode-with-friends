class Solution:
    def isValid(self, s: str) -> bool:
        
        if len(s) is 0:
            return True
        if len(s) is 1:
            return False
        
        sLeft = collections.deque()
        
        dictionary = {")":"(", "}":"{", "]":"["}
        
        for c in s: 

            if c is '(' or c is '{' or c is '[':
                sLeft.append(c)
            elif not sLeft:
                return False
            
            else:
                char = sLeft.pop()
                if char is not dictionary[c]:
                    return False
        
        if sLeft:
            return False
        
        return True