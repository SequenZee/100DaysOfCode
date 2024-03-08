import java.util.*;
public class Solution{
    int solve(int num1,int num2){
        //code here
        int prime[] = new int[10000]; //0 for prime 1 for non prime
        for(int i = 2; i< 10000;i++)
        {if(prime[i] == 0)
        {
           for( int j = i * i ; j <10000;j = j +i)
            {
                prime[j] =1;
            }
        }
        }
        
        int res[] = new int[10000];
        Arrays.fill(res,-1);
        res[num1] = 0;
        
        Queue<Integer> q = new LinkedList<>();
        q.add(num1);
        while(q.size()> 0)
        {
            int num = q.remove();
            for(int i = 0;i <4;i++)
            {
                for(int j = 0; j<10;j++)
                {
                    if(i == 0 && j == 0) continue;
                    
                    String str = String.valueOf(num);
                    String nstr = str.substring(0,i) + String.valueOf(j)+str.substring(i+1);
                    int ns = Integer.valueOf(nstr);
                    if(prime[ns] == 0 && res[ns] == -1)
                    {
                        res[ns] = 1 + res[num];
                        q.add(ns);
                    }
                }
            }
        }
        return res[num2];
    }
    public static void main(String[] args) {
        int num1 = 1033;
        int num2 = 8179;

        Solution sol = new Solution();
        int output = sol.solve(num1, num2);
        System.out.println(output);
    }
}


