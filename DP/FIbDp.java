package DP;

import java.util.HashMap;

public class FIbDp {
    
    // normal algo to find fibo, TC = 2**n
    int fibo(int n){
        if(n < 2){
            return n;
        }

        else {
            return fibo(n-1) + fibo(n-2);
        }

        
    }


    // using dynaming programmming, using memorization technique, TC = n

    int fidDp(int n , HashMap<Integer, Integer> map){
        // base case
        if (n<2){
            return n;
        }

        // insert into hashmap

        if(map.containsKey(n)){
            return map.get(n);
        }

        // recursive call
        int value = fidDp((n-1), map) + fidDp(n-2, map);

        // insert into hash map
        map.put(n, value);

        return value;
    }

    public static void main(String[] args){
        FIbDp d = new FIbDp();

        // int result = d.fibo(20);

        HashMap<Integer, Integer> map = new HashMap<>()
        System.out.println(d.fidDp(20, map));
    }
}
