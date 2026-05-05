import java.util.HashMap;
import java.util.Map;

public class MaxMinFreqElement {
    
    void Frequencey(int arr[]){

        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        int maxfreqele=0;
        int maxfreq=0;

       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int ele=entry.getKey();
            int freq=entry.getValue();

            if(freq>maxfreq){
                maxfreq=freq;
                maxfreqele=ele;
            }
       }
       System.out.println(maxfreq);
       System.out.println(maxfreqele);

    }
    
    
    public static void main(String[] args) {
        MaxMinFreqElement m=new MaxMinFreqElement();
        m.Frequencey(new int[]{10,5,3,10,5,5,3,3,3,3,3,10,10,5});
    }
}
