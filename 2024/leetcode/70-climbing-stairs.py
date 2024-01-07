class Solution: 
    def climbStairs(self,n ):
        if n == 1: return 1
        a, b = 1, 1
        for i in range(2, n) :
            temp = a + b
            a = b
            b = temp
        return a + b
