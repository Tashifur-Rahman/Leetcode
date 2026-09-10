class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid.length==0)
        return 0;
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2)
                q.offer(new int[]{i,j});
                else if(grid[i][j]==1)
                fresh++;
            }
        }
        if(fresh==0) return 0;
        int[][] dir={{0,1},{1,0},{-1,0},{0,-1}};
        int minutespassed=-1;
        while(!q.isEmpty())
        {
            int Orangeincurrentlevel=q.size();
            minutespassed++;
            for(int i=0;i<Orangeincurrentlevel;i++)
            {
                int[] position=q.poll();
                int row=position[0],col=position[1];
                for(int[] d:dir){
                    int newrow=row+d[0];
                    int newcol=col+d[1];
                    if(newrow<0||newrow>=grid.length||newcol<0||newcol>=grid[0].length||grid[newrow][newcol]!=1){
                    continue;
                    }
                    grid[newrow][newcol]=2;
                    fresh--;
                    q.offer(new int[]{newrow,newcol});
                }
            }
        }
        if(fresh==0)
         return minutespassed;
        return -1;
    }
}