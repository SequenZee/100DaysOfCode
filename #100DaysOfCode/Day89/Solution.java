import java.util.*;
class Solution{
    static ArrayList<Integer> recamanSequence(int n){
       
         ArrayList<Integer> seq = new ArrayList<>();
        HashSet<Integer> s = new HashSet<>();
        seq.add(0);
        s.add(0);
        int i =1;
        while(i < n) {
            int prev = seq.get(i - 1);
            int next = prev - i;
            if (next < 0 || s.contains(next)) {
                next = prev + i;
            }
            seq.add(next);
            s.add(next);
            i++;
        }
        return seq;
    }
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> output = recamanSequence(n);
       
        for (int num : output) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
