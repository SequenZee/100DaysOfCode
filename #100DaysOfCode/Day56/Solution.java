import java.util.*;
public class Solution
{
    
    ArrayList<Integer> search(String pat, String txt)
    {
       
          ArrayList<Integer> list = new ArrayList<>();
        int index = txt.indexOf(pat);
        while(index != -1){
            list.add(index+1);
            index=txt.indexOf(pat,index+1);
        }
        return list;
    }

    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String pat = "geek";
        
        Solution solution = new Solution();
        ArrayList<Integer> result = solution.search(pat, txt);
        
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() - 1)
                System.out.print(" ");
        }
    }

    
    
}