import java.util.*;
class Solution
{

    public static String[] winner(String arr[], int n)
    {

        Map<String , Integer> map = new HashMap<>();
        
        int max = 0 ;
        for(int i = 0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            max = Math.max(max, map.get(arr[i]));
        }
   
        
        String[] temp = new String [2];
        temp[1] = "ab";
        for(int i =0 ;i<n;i++){
            if(map.get(arr[i])==max && temp[1].equals("ab")){
                temp[0] = arr[i];
                temp[1] = max+"";
            } else if(map.get(arr[i])==max && temp[0].compareTo(arr[i])>0 ){
                temp[0]= arr[i];
            }
        }
        return temp;
        
    }

    public static void main(String[] args) {
        int n = 13;
        String[] arr = {"john", "johnny", "jackie", "johnny", "john", "jackie", "jamie", "jamie", "john", "johnny", "jamie", "johnny", "john"};
        String[] result = winner(arr, n);
        System.out.println(result[0] + " " + result[1]);
    }
}
