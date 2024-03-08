import java.util.*;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class Solution
{
   
    double fractionalKnapsack(int W, Item arr[], int n) 
        {
        // Your code here 
        Arrays.sort(arr,new Comparator<Item>(){
            @Override
            public int compare(Item a, Item b){
                double first = (double) a.value/a.weight;
                double second = (double) b.value/b.weight;
                return Double.compare(second,first);
            }
        });
        
        
        double answer = 0.0;
        for(Item x : arr) {
            if(x.weight <= W){
                answer += (double)x.value;
                W -= x.weight;
            }
            else{
                answer += W * (double)x.value/(double)x.weight;
                W -= W;
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        int N = 3;
        int W = 50;
        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};

        Item[] items = new Item[N];
        for (int i = 0; i < N; i++) {
            items[i] = new Item(value[i], weight[i]);
        }

        Solution sol = new Solution();
        double output = sol.fractionalKnapsack(W, items, N);
        System.out.println(output);
    }
}
