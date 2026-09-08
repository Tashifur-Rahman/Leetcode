class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
       for (int num : nums) {
        if (!map.containsKey(num)) {
            map.put(num, 1);
        } else {
            map.put(num, map.get(num) + 1);
        }
    }
    for(int num:map.keySet()){
        pq.offer(new int[]{num,map.get(num)});
        if(pq.size()>k)
         pq.poll();

    }
    int[] res=new int[k];
    int i=0;
      while(!pq.isEmpty()){
         res[i]=pq.poll()[0];
         i++;
      }
    return res;
    }
}