public class Solution
{
    public int isPossible(int[][] paths)
    {
        int v = paths.length;
        int indeg[] = new int[v];
        
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(paths[i][j]==1){
                    indeg[i]++;
                }        
            }
        }
        
        for(int i=0;i<v;i++){
            if(indeg[i]%2!=0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
    
        int[][] paths = { { 0, 1, 1, 1, 1 }, { 1, 0, 0, 1, 0 }, { 1, 0, 0, 1, 0 }, { 1, 1, 1, 0, 1 }, { 1, 0, 0, 1, 0 } };

        Solution sol = new Solution();
        int result = sol.isPossible(paths);

        System.out.println(result);
    }
}
