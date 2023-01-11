
static int divisibleSumPairs(int n, int k, List<int> ar)
    {
        int pairs = 0; 
        for (int i = 0; i < ar.Count; i ++)
            for (int j = i + 1; j < ar.Count; j++){
                int s = ar[i] + ar[j]; 
                if (s%k == 0)
                    pairs++; 
            }

        return pairs;
    }