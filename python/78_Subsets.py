
class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        sol = []
        def backtrack(curr_set, i):
            if len(curr_set) == curr_iteration:
                sol.append(curr_set[:])
                return
            
            for index in range(i, n):
                curr_set.append(nums[index])
                backtrack(curr_set, index + 1)
                curr_set.pop()
        n = len(nums)

        for curr_iteration in range(n + 1):
            backtrack([], 0)
        return sol