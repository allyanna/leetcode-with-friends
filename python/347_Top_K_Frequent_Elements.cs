public class Solution {
    public int[] TopKFrequent(int[] nums, int k) {
        
        // Return array
        int [] values = new int[k];
        Dictionary<int, int> dict = new Dictionary <int, int>(); 

        // Get the count of all the values inside the array
        for(int i = 0; i < nums.Length; i++){
            if(dict.ContainsKey(nums[i])){
                dict[nums[i]]++; 
            }
            else {
                dict.Add(nums[i], 1);
            }
        }

        // use PriorityQ or heap to keep track of the top 
        // repeated values.
        var pq = new PriorityQueue<int, int>(); 
        foreach(var key in dict.Keys){
            pq.Enqueue(key, dict[key]); 
            if(pq.Count > k) pq.Dequeue(); 
        }

        // Pop those values
        int index = k; 
        while(pq.Count > 0)
        {   
            index--; 
            values[index] = pq.Dequeue();
        }
        return values; 
    }
}