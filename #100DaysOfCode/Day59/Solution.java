import java.util.*;
public class Solution{
  
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
       
        List<Integer> al=new ArrayList<>();
        while(!q.isEmpty() && k-->0) al.add(0,q.poll());
        while(!q.isEmpty()) al.add(q.poll());
        for(int i:al) q.add(i);
        return q;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int k = scanner.nextInt(); 
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(scanner.nextInt()); 
        }
        
        Solution solution = new Solution();
        Queue<Integer> result = solution.modifyQueue(queue, k);
        
       
        while (!result.isEmpty()) {
            System.out.print(result.poll() + " ");
        }
    }
}
