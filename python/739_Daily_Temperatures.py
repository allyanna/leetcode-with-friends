
temps=[73,74,75,71,69,72,76,73]

# def dailyTemperatures(temps):
#     right=1
#     left=0
#     solution=[]
#     while left<len(temps):
#         if right<len(temps) and temps[left]<temps[right]:
#             solution.append(right-left)
#             left+=1
#             right=left+1
#         else:
#             right+=1
#         if right==len(temps):
#             left+=1
#             right=left+1
#             solution.append(0)
    
#     print(solution)

def dailyTemperatures(temperatures):
        res = [0] * len(temperatures)
        stack = []  # pair: [temp, index]

        for i, t in enumerate(temperatures):
            while stack and t > stack[-1][0]:
                stackT, stackInd = stack.pop()
                res[stackInd] = i - stackInd
            stack.append((t, i))
        return res
    
dailyTemperatures(temps)

