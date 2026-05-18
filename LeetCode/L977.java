package LeetCode;

// git pull origin main --rebase
// git add .
// git commit -m "message"
// git push origin main
class L977 {
    public int[] sortedSquares(int[] arr) {
        
        int i=0;
        int j=arr.length-1;
        int n=arr.length;
        int pos=n-1;
        int newarr[]=new int[n];

        while(i<=j){

            if(Math.abs(arr[i]) < Math.abs(arr[j])){
                newarr[pos]=arr[j]*arr[j];
                j--;
            }
            else{
                newarr[pos]=arr[i]*arr[i];
                i++;
            }
            pos--;
        }

        return newarr;
        

    }
}