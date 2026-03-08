import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Arrays2 {

    //Left Rotating array by one place 
    //Eg. 1 2 3 4 5  Answer -> 2 3 4 5 1 
    void rotateleft(int arr[]){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }

    //Rotate left upto 'S' numbers in same array
    void leftRotate(int arr[],int s){
        int n=arr.length;
        s=s%n;
        int temp[]=new int[s];
        for(int i=0;i<s;i++){
            temp[i]=arr[i];
        }

        for(int i=s;i<n;i++){
            arr[i-s]=arr[i];
        }

        for(int i=n-s;i<n;i++){
            arr[i]=temp[i-(n-s)];
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }

    void reverse(int arr[],int start,int end){
        int j=end;
        for(int i=start;i<j;i++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }

    }
    void leftRotate1(int arr[],int s){
        int n=arr.length;
        reverse(arr, 0, s-1);
        reverse(arr, s, n-1);
        reverse(arr, 0, n-1);

         for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }

    void moveZerosToEnd(int arr[]){
        int n=arr.length;
        int temp[]=new int[n];
        int t=0;

        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[t]=arr[i];
                t++;
            }
        }

        for(int i=0;i<temp.length;i++){
            arr[i]=temp[i];
        }

        int zeros=arr.length-temp.length;
        for(int i=temp.length;i<n;i++){
            arr[i]=0;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    
    //union of two sorted array
    // Both the array must be sorted
    ArrayList<Integer> unionarray(int arr1[],int arr2[]){
        
        // TreeSet<Integer> ts=new TreeSet<>();
        
        // for(int i=0;i<arr1.length;i++){
        //     ts.add(arr1[i]);
        // }

        // for(int i=0;i<arr2.length;i++){
        //     ts.add(arr2[i]);
        // }

        // Object union[]=ts.toArray();
        // for(int i=0;i<union.length;i++){
        //     System.out.print(union[i]);
        // }

        //ORRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR

        int n1=arr1.length;
        int n2=arr2.length;
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n1 && j<n2){

            //if arr1 element is small the add in list if previous element is not equal to current element
            // i++ is important
            if(arr1[i]<=arr2[j]){
                if(list.size()==0 || list.get(list.size()-1)!=arr1[i])
                    list.add(arr1[i]);
                    i++;
    
            }

            //if arr2 element is small the add in list if previous element is not equal to current element
            // j++ is important
            else if(arr2[j]<arr1[i]){
                if(list.size()==0 || list.get(list.size()-1)!=arr2[j])
                    list.add(arr2[j]);
                    j++;
                 
            }

        }

        //if index of j end then only work on i
        while(i<n1){
                if(list.size()==0 || list.get(list.size()-1)!=arr1[i])
                    list.add(arr1[i]);
                    i++;
                
        }

        //if index of i end then only work on j
        while(j<n2){
                if(list.size()==0 || list.get(list.size()-1)!=arr2[j])
                    list.add(arr2[j]);
                    j++;
                
        }

        return list;
    }


    ArrayList<Integer> findSortedArrayIntersection(int arr1[],int arr2[]){
        // // take array to track wheather element is already there or not
        // int visited[]=new int[arr1.length];
        // ArrayList<Integer> list=new ArrayList<>();
        // for(int i=0;i<arr1.length;i++){
        //     for(int j=0;j<arr2.length;j++){
        //         if(arr1[i]==arr2[j]  &&  visited[j]!=1){
        //             list.add(arr1[i]);
        //             visited[j]=1;
        //             break;
        //         }

        //         if(arr2[j]>arr1[i]) break;
        //     }
        // }
        // return list;

        int i=0;
        int j=0;
        int n1=arr1.length;
        int n2=arr2.length;
        ArrayList<Integer> list=new ArrayList<>();

        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }
            else{
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        return list;
    } 




    public static void main(String[] args) {
        
        Arrays2 a2=new Arrays2();
        int arr1[]={1,2,3,4,5,6,7};
        int arr2[]={1,3,3,5,8};

        System.out.println(a2.findSortedArrayIntersection(arr1, arr2));
    //    System.out.println(a2.unionarray(arr1, arr2));
        // System.out.println(a2.linearSearch(arr, 7));
        // a2.moveZerosToEnd(arr);
        // a2.leftRotate1(arr, 3);
        // a2.rotateleft(arr);
    }
}
