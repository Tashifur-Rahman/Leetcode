class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
       int[] res=new int[deck.length];
       Queue<Integer> q=new LinkedList<>();
       for(int i=0;i<deck.length;i++)
        q.offer(i);
       for(int n:deck){
        int i=q.poll();
        res[i]=n;
        if(!q.isEmpty())
        q.offer(q.poll());
       } 
       return res;
    }
}