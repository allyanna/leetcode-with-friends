def topKFrequent(nums, k):
        count = {}
        solution=[]
        kk=k
        #Such that the frequency
        freq = [[] for i in range(len(nums) + 1)]

        for n in nums:
            count[n] = 1 + count.get(n, 0)
        for n, c in count.items():
            freq[c].append(n)
        
        for num in range(len(freq)-1, 0, -1) :
            if freq[num]:
                for n in freq[num]:
                   solution.append(n)
                   kk-=1
                   if kk==0:
                      return solution
        
            # if freq[num]:
            #     solution.append[freq[num[0]]]
            #     kk-=1
        
        print(freq)


        


n=topKFrequent([1,2,1,2,3],2)
print(n)