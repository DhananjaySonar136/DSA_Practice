import java.util.HashMap;

public class Hashing_hashMap {

//this is for numbers to count frequency
    // void count(int arr[]){
    //     HashMap<Integer,Integer> map=new HashMap<>();

    //     for(int i=0;i<arr.length;i++){
    //         int val=map.getOrDefault(arr[i],0);
    //         map.put(arr[i], val+1);
    //     }

    //     System.out.println(map.get(1));
    //     System.out.println(map.get(2));
    //     System.out.println(map.get(3));
    //     System.out.println(map.get(4));

    // }


//For string or character
    void count(String str){
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<str.length();i++){
            int val=map.getOrDefault(str.charAt(i),0);
            map.put(str.charAt(i), val+1);
        }

        System.out.println(map.get('a'));
        System.out.println(map.get('b'));
        System.out.println(map.get('c'));
        System.out.println(map.get('f'));
        System.out.println(map.get('z'));

    }

    public static void main(String[] args) {
        Hashing_hashMap h=new Hashing_hashMap();
        int arr[]={1,2,3,2,3,4,1};
        String str="abcdabcdf";
        h.count(str);
    }
}
