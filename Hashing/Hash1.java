package Hashing;

import java.util.HashMap;

public class Hash1 {

    static void freq(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
                // System.out.println(map.getOrDefault(map.get(arr[i])),0);
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        map.forEach((key,value)->{
                System.out.println(key+" : "+value);
        });

    }

    public static void main(String[] args) {
        freq(new int[]{1,2,3,1,2,4,5,3});
    }
}
