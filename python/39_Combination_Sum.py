class Solution:
    def combinationSum(self, candidates, target):
        def findNumbers(ans, arr, temp, su, index):
            if su == 0:
                ans.append(list(temp))
            for i in range(index, len(arr)):
                if(su - arr[i]) >= 0:
                    temp.append(arr[i])
                    findNumbers(ans, arr, temp, su - arr[i], i)
                    temp.remove(arr[i])

        ans = []
        temp = []
        candidates = sorted(list(set(candidates)))
        findNumbers(ans, candidates, temp, target, 0)

        return ans

sol = Solution()

print(sol.combinationSum([3,4, 5, 2], 7))