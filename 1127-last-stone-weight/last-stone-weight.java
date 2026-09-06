class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            pq.offer(stone);
        }
        while(pq.size()>1){
            int largest=pq.poll();
            if(pq.peek()==largest){
            pq.poll();
            }
            else{
                int diff=largest-pq.poll();
                pq.offer(diff);
            }
        }
        if(pq.isEmpty())
         return 0;
        else
         return pq.peek();
    }
}